package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Client {
    private String name;
    private String email;
    private LocalDate moment;


    Order order;

    public Client(){

    }

    public Client(String name, String email, LocalDate date) {
        this.name = name;
        this.email = email;
        this.moment = date;

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n");
        builder.append("ORDER SUMMARY:"+"\n");
        builder.append("Order moment: ");
        builder.append(order.getMoment().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))+"\n");
        builder.append("Order status: ");
        builder.append(getOrder().getStatus()+"\n");
        builder.append("Client: ");
        builder.append(getName()+" ");
        builder.append(getDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+" - ");
        builder.append(getEmail()+"\n");
        builder.append("Order items:"+"\n");

        for (OrderItem ordI : getOrder().listOrderItem){
            builder.append(ordI.getProduct().getName()+"| ");
            builder.append("$"+ordI.getPrice()+"| ");
            builder.append("QUANTITY: "+ordI.getQuantity()+"| ");
            builder.append("SUBTOTAL: "+ordI.subTotal()+"\n");
        }

        builder.append("TOTAL PRICE: "+getOrder().total());

        return builder.toString();

    }


    public void addOrder(LocalDateTime local, OrderStatus status){
        this.order = new Order(local, status);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDate() {
        return moment;
    }

    public void setDate(LocalDate date) {
        this.moment = date;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
