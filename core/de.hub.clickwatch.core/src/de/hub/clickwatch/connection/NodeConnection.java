package de.hub.clickwatch.connection;

import java.io.IOException;
import java.net.InetAddress;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;
import com.google.inject.name.Named;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.ClickWatchModule;
import de.hub.clickwatch.connection.adapter.AbstractAdapter;
import de.hub.clickwatch.connection.adapter.IHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.connection.adapter.INodeAdapter;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.util.Throwables;

public class NodeConnection implements INodeConnection {

	@Inject
	private IClickSocket clickSocket;
	
	@Inject 
	private IMetaDataAdapter metaDataAdapter;
	@Inject
	private IHandlerAdapter handlerAdapter;
	@Inject 
	private IValueAdapter valueAdapter;
	@Inject 
	private INodeAdapter nodeAdapter;
	
	private String host;
	private String port;
	protected Node node;
	
	private boolean isConnected = false;
	
	@Inject 
	@Named(ClickWatchModule.DEFAULT_TIMEOUT)
	private int timeout;
	
	public void init(String host, String port) {
		this.host = host;
		this.port = port;
	}
	
	protected void init(Node node) {
		this.node = node;
		init(node.getINetAddress(), node.getPort());
	}

	@Override
	public void connect() {
		try {
			clickSocket.connect(InetAddress.getByName(host), new Integer(port), timeout);
			isConnected = true;
		} catch (IOException e) {
			Throwables.propagate(e);
		}
		
		((AbstractAdapter)metaDataAdapter).clearCaches();
		((AbstractAdapter)handlerAdapter).clearCaches();
		((AbstractAdapter)nodeAdapter).clearCaches();
	}
	
	protected void clearAllCaches() {
		((AbstractAdapter)metaDataAdapter).clearCaches();
		((AbstractAdapter)handlerAdapter).clearCaches();
		((AbstractAdapter)nodeAdapter).clearCaches();
	}

	@Override
	public boolean isConnected() {
		return isConnected;
	}

	@Override
	public void disconnect() {
		clickSocket.close();
		isConnected = false;
	}
	
	protected void init(AbstractAdapter abstractAdapter) {
		abstractAdapter.init(clickSocket, this);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Class<T> adapterClass) {
		if (adapterClass == IMetaDataAdapter.class) {
			init((AbstractAdapter)metaDataAdapter);
			return (T)metaDataAdapter;
		} else if (adapterClass == IHandlerAdapter.class) {
			init((AbstractAdapter)handlerAdapter);
			return (T)handlerAdapter;
		} else if (adapterClass == IValueAdapter.class) {
			init((AbstractAdapter)valueAdapter);
			return (T)valueAdapter;
		} else if (adapterClass == INodeAdapter.class) {
			init((AbstractAdapter)nodeAdapter);
			return (T)nodeAdapter;
		} else {
			Preconditions.checkArgument(false, "Unknown adapter " + adapterClass.getCanonicalName());
			return null;
		}
	}
	
	
}