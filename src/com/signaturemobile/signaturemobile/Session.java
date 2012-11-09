/*
 * Copyright (c) 2011 CEPSA. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * CEPSA ("Confidential Information").  You shall not disclose such 
 * Confidential Information and shall use it only in accordance with 
 * the terms of the license agreement you entered into with CEPSA.
 */
package com.signaturemobile.signaturemobile;

import java.io.Serializable;
import java.util.HashMap;

/** 
 * Session stores values than can be used by different instances of the application,
 * and which have validity during a user's session.
 *
 * @author <a href="mailto:moisesvs@gmail.com">Mooisés Vázquez Sánchez</a>
 */
@SuppressWarnings("serial")
public class Session implements Serializable {
    
    // Notification constants
	/**
	 * Has map for store objects used as parameters between activities
	 */
	private transient HashMap<String, Object> parametersMap;
    
    /**
     * Toolbox application
     */
	private transient ToolBox toolbox;
    
	/**
     * Default constructor
     */
    public Session(ToolBox toolbox) {
    	this.toolbox = toolbox;

//    	save();
    }

//	public void save() {
//	    try {
//            Tools.writeToFile(this, new File(toolbox.getCacheDirectory(), SESSION_FILE_NAME));
//        } catch (IOException e) {
//            // Do nothing. Assoume session could not be serialized
//            e.printStackTrace();
//        }
//    }
	
//	public static Session loadSession() {
//		return (Session) Tools.readFromFile(new File(CepsaApplication.getInstance().getToolBox().getCacheDirectory(), SESSION_FILE_NAME));
//	}
	
	// Getters/setters
    /**
     * Sets toolbox into current session
     * 
     * @param toolbox
     */
    public void setToolbox(ToolBox toolbox) {
        this.toolbox = toolbox;
    }
	
	/**
	 * @return the parametersMap
	 */
	public HashMap<String, Object> getParametersMap() {
	    if (parametersMap == null) {
	        parametersMap = new HashMap<String, Object>();
	    }
		return parametersMap;
	}

	// Functional methods    
    /**
     * Serialize object
     * 
     * @param out
     * @throws IOException
     */
//    private void writeObject(ObjectOutputStream out) throws IOException {
//        boolean userLocationSerialized = (userLocation != null);
//        boolean locateCarSerialized = (localeCar != null);
//        boolean routeSerialized = (route != null);
//        
//        out.writeBoolean(userLocationSerialized);
//        out.writeBoolean(locateCarSerialized);
//        out.writeBoolean(routeSerialized);
//        
//        if (userLocationSerialized) {
//            out.writeObject(userLocation);
//        }
//        
//        if (locateCarSerialized) {
//            out.writeObject(localeCar);
//        }
//        
//        if (routeSerialized) {
//            out.writeObject(route);
//        }
//
//        out.writeBoolean(aroundLocationMode);
//        
//        int lastUserItemsSize = lastUsedLocations.size();;
//        if (lastUserItemsSize > LAST_USED_LOCATIONS_MAXIMUM_CAPACITY) {
//            Collections.sort(lastUsedLocations);
//            
//            for (int i = lastUserItemsSize; i > LAST_USED_LOCATIONS_MAXIMUM_CAPACITY; i--) {
//                lastUsedLocations.remove(i - 1);
//            }
//        }
//        out.writeObject(lastUsedLocations); // Always serialize. Never null
//        
//        lastUserItemsSize = this.lastUsedRoutes.size();;
//        if (lastUserItemsSize > LAST_USED_ROUTES_MAXIMUM_CAPACITY) {
//            Collections.sort(lastUsedRoutes);
//            
//            for (int i = lastUserItemsSize; i > LAST_USED_ROUTES_MAXIMUM_CAPACITY; i--) {
//                lastUsedRoutes.remove(i - 1);
//            }
//        }
//        out.writeObject(lastUsedRoutes); // Always serialize. Never null
//        
//        if (dateCurrent != null)
//            out.writeObject(dateCurrent);
//        
//        out.writeObject(sessionUser); // Always serialize. Never null
//    }

    /**
     * Deserialize Object
     * @param in
     * @throws IOException
     * @throws ClassNotFoundException
     */
//    @SuppressWarnings("unchecked")
//    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
//        boolean userLocationSerialized = in.readBoolean();
//        boolean locateCarSerialized = in.readBoolean();
//        boolean routeSerialized = in.readBoolean();
//        
//        if (userLocationSerialized) {
//            userLocation = (Location) in.readObject();
//        }
//        
//        if (locateCarSerialized) {
//            localeCar = (LocateCar) in.readObject();
//        }
//        
//        if (routeSerialized) {
//            route = (Route) in.readObject();
//        }
//
//        aroundLocationMode = in.readBoolean();
//        
//        lastUsedLocations = (Vector<TimedLocation>) in.readObject(); // Always serialize. Never null
//        lastUsedRoutes = (Vector<TimedRoute>) in.readObject(); // Always serialize. Never null
//        dateCurrent = (Date) in.readObject();
//        sessionUser = (SessionUser) in.readObject();
//        sessionUser.setExpired(true);
//    }

}