package com.smartdevicelink.protocol;

import com.smartdevicelink.protocol.enums.MessageType;
import com.smartdevicelink.protocol.enums.SessionType;

public class ProtocolMessage {
	private byte version = 1;
	private SessionType _sessionType = SessionType.RPC;
	private MessageType _messageType = MessageType.UNDEFINED;
	private byte _sessionID = 0;
	private byte _rpcType;
	private int _functionID;
	private int _correlationID;
	private int _jsonSize;
	private boolean payloadProtected = false;
	
	int priorityCoefficient = 0;

	private byte[] _data = null;
	private byte[] _bulkData = null;
	
	public ProtocolMessage() {}

	public byte getVersion() {
		return version;
	}

	public void setVersion(byte version) {
		this.version = version;
	}

	public byte getSessionID() {
		return _sessionID;
	}

	public void setSessionID(byte sessionID) {
		this._sessionID = sessionID;
	}

	public byte[] getData() {
		return _data;
	}

	public void setData(byte[] data) {
		this._data = data;
		this._jsonSize = data.length;
	}
	
	public void setData(byte[] data, int length) {
		if (this._data != null)
			this._data = null;
		this._data = new byte[length];
		System.arraycopy(data, 0, this._data, 0, length);
		this._jsonSize = 0;
	}	

	public byte[] getBulkData() {
		return _bulkData;
	}

	public void setBulkDataNoCopy(byte[] bulkData) {
		this._bulkData = bulkData;
	}

	public void setBulkData(byte[] bulkData) {
		if (this._bulkData != null)
			this._bulkData = null;
		this._bulkData = new byte[bulkData.length];
		System.arraycopy(bulkData, 0, this._bulkData, 0, bulkData.length);
		//this._bulkData = bulkData;
	}
	
	public void setBulkData(byte[] bulkData, int length) {
		if (this._bulkData != null)
			this._bulkData = null;
		this._bulkData = new byte[length];
		System.arraycopy(bulkData, 0, this._bulkData, 0, length);
		//this._bulkData = bulkData;
	}

	public SessionType getSessionType() {
		return _sessionType;
	}

	public void setSessionType(SessionType sessionType) {
		this._sessionType = sessionType;
	}

	public MessageType getMessageType() {
		return _messageType;
	}

	public void setMessageType(MessageType messageType) {
		this._messageType = messageType;
	}
	
	public byte getRPCType() {
		return _rpcType;
	}
	
	public void setRPCType(byte _rpcType) {
		this._rpcType = _rpcType;
	}
	
	public int getFunctionID() {
		return _functionID;
	}
	
	public void setFunctionID(int _functionID) {
		this._functionID = _functionID;
	}
	
	public int getCorrID() {
		return _correlationID;
	}
	
	public void setCorrID(int _correlationID) {
		this._correlationID = _correlationID;
	}

	public int getJsonSize() {
		return _jsonSize;
	}

	public void setJsonSize(int _jsonSize) {
		this._jsonSize = _jsonSize;
	}
	
	public void setPayloadProtected(boolean bVal) {
		payloadProtected = bVal;
	}
	
	public boolean getPayloadProtected() {
		return payloadProtected;
	}	
	
	/**
	 * Set the priority for this packet. The lower the number the higher the priority. <br>0 is the highest priority and the default.
	 * @param priority
	 */
	public void setPriorityCoefficient(int priority){
		this.priorityCoefficient = priority;
	}
	public int getPrioirtyCoefficient(){
		return this.priorityCoefficient;
	}
} // end-class