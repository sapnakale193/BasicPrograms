package com.Kalyani_Mam_OOPSCode;

        public class Car {

	    private String name;
	    private double price;
	    private Engine engine;

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public Engine getEngine() {
	        return engine;
	    }

	    public void setEngine(Engine engine) {
	        this.engine = engine;
	    }

	    public static class Engine {
	        private String type;

	        public String getType() {
	            return type;
	        }

	        public void setType(String type) {
	            this.type = type;
	        }
	    }
	
        }
       