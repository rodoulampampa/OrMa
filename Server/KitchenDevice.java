public class KitchenDevice extends Device {

      private List<Order> order_list;
      private List<Notification> notification_list;

      public kitchenDevice(List<Order> order_list, List<Notification> notification_list) {
            this.order_list = order_list;
            this.notification_list = notification_list;
      }


}
