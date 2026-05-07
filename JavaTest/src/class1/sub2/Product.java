package class1.sub2;

public class Product {
		protected String productId;
		protected String productName;
		protected int price;
		protected int quantity;
		
		public Product(String productId, String productName, int price, int quantity) {
			this.productId = productId;
			this.productName = productName;
			this.price = price;
			this.quantity = quantity;
		}
		
		public void updatePrice(int newPrice) {
			this.price = newPrice;
			System.out.println(this.productName + " 가격 수정 됨");
		}
		
		public void addStock(int addquantity) {
			this.quantity += addquantity;
			System.out.printf("%d개 추가 됨\n", addquantity);
		}
		
		public void printProductInfo() {
			System.out.println("상품 ID: " + this.productId);
			System.out.println("상품 이름: " + this.productName);
			System.out.println("가격: " + this.price);
			System.out.println("재고 수량: " + this.quantity);
		}
		
		

	
}
