package de.hub.clickwatch.recorder;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.StringValueAdapter;

public class CWRecorderModule extends AbstractModule {

	public static final String L_DEFAULT_UPDATE_INTERVAL_PROPERTY		= "CWRecorderModule.defaultUpdateInterval";
	public static final String I_HANDLER_PER_RECORD_PROPERTY 			= "CWRecorderModule.handlerPerRecord";
	public static final String B_RECORD_CHANGES_ONLY_PROPERTY	 		= "CWRecorderModule.recordChangesOnly";
	public static final String DB_VALUE_ADAPTER_PROPERTY 				= "CWRecorderModule.dbValueAdapter";
	
	@Override
	protected void configure() {
		bind(long.class).annotatedWith(Names.named(L_DEFAULT_UPDATE_INTERVAL_PROPERTY)).toInstance(new Long(2000));
		configureHandlerPerRecord();
		bind(boolean.class).annotatedWith(Names.named(B_RECORD_CHANGES_ONLY_PROPERTY)).toInstance(true);
		bind(IValueAdapter.class).annotatedWith(Names.named(DB_VALUE_ADAPTER_PROPERTY)).to(StringValueAdapter.class);
	}
	
	protected void configureHandlerPerRecord() {
		bind(int.class).annotatedWith(Names.named(I_HANDLER_PER_RECORD_PROPERTY)).toInstance(2000);
	}
		
}