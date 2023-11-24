package com.orders.system.lambdas;

public class TidGenerator {

    public Response handler() {
        Double value = Math.random()*100000;
		String message = String.format("%08d", value.intValue());
        return new Response(200, message);
	}

    public static class Response {
		public Integer statusCode;
		public String body;
		
		public Response(Integer statusCode, String body) {
			this.statusCode = statusCode;
			this.body = body;
		}
	}
    
}
