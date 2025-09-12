package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;

    List<OrderItem> listOrderItem = new ArrayList<>();

    public Order(){

    }

    public Order(LocalDateTime moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }



    public void addOrderItem(OrderItem item){
        listOrderItem.add(item);
    }


    public void removeItem(OrderItem item){
        listOrderItem.remove(item);
    }


    public Double total(){
        double tot = 0;
        for (OrderItem ordI : listOrderItem){
            tot += ordI.subTotal();

        }
        return tot;
    }











    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getListOrder() {
        return listOrderItem;
    }

    public void setListOrder(List<OrderItem> listOrder) {
        this.listOrderItem = listOrder;
    }
}
