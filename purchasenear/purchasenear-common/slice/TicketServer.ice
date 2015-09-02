[["java:package:org.purchasenear.service.ticket"]]
module interf{
	struct Order { 
		long orderId; 
		string phone; 
		string orderNum;
		int orderDate;
		int ticketType;
		double amount;
		int orderStatus;
	};
	
	sequence<Order> OrderSeq;
	
	interface TicketService{
		bool createOrder(Order myOrder);
		OrderSeq queryMyOrders(string phone);
		bool cancelOrder(long orderId);
	};
};
