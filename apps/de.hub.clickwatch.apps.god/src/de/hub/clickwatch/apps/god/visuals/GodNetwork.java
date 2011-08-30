package de.hub.clickwatch.apps.god.visuals;

import java.util.ArrayList;
import java.util.List;

import processing.core.PApplet;

public class GodNetwork extends PApplet {
	private static final long serialVersionUID = 1256103591115689424L;
	private List<NetworkNode> nodes = new ArrayList<NetworkNode>();
	private NodeRefresher nodeRefresher = null;
	
	@Override
	public void setup() {
		size(800, 600, JAVA2D);
		smooth();
		
		nodeRefresher = new NodeRefresher(this);
		nodeRefresher.start();
	}
	
	@Override
	public void draw() {
		background(255);
		synchronized (nodes) {
			for (NetworkNode n : nodes) {
				n.display();
			}
		}
	}
	
	@Override
	public void mousePressed() {
		synchronized (nodes) {
			for (NetworkNode n : nodes) {
				if (n.selectItem(mouseX, mouseY)) {
					break;
				}
			}
		}
	}
	
	@Override
	public void mouseReleased() {
		synchronized (nodes) {
			for (NetworkNode n : nodes) {
				n.deselectItem();
			}
		}
	}
	
	public void addNode(String mac) {
		synchronized (nodes) {
			nodes.add(new NetworkNode(this, mac));
		}
	}
	
	public List<String> getNodeNames() {
		List<String> names = new ArrayList<String>();
		synchronized (nodes) {
			for (NetworkNode node : nodes) {
				names.add(node.getMac());
			}
		}
		return names;
	}
}
