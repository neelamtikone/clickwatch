package de.hub.clickwatch.connection.adapter;

import com.google.inject.ImplementedBy;

import de.hub.clickwatch.model.Handler;

@ImplementedBy(StringValueAdapter.class)
public interface IValueAdapter {

	public String getPlainRealValue(Handler handler);
	
	public void setModelValue(Handler handler, String realValue);
	
	public void moveValue(Handler source, Handler target);
}