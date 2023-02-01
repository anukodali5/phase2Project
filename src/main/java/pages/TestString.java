package pages;

public class TestString {
	public static void main(String[] args) {
		String taxamount = "Tax: $2.40";
		String ProductPeice = "$29.99";
		Float finalPrice = null;
		System.out.println(Float.parseFloat(taxamount.substring(6, taxamount.length())));
		System.out.println(Float.parseFloat(ProductPeice.substring(1, ProductPeice.length())));
		System.out.println(Float.parseFloat(taxamount.substring(6, taxamount.length()))
				+ Float.parseFloat(ProductPeice.substring(1, ProductPeice.length())));
		finalPrice = Float.parseFloat(taxamount.substring(6, taxamount.length()))
				+ Float.parseFloat(ProductPeice.substring(1, ProductPeice.length()));
		System.out.println(finalPrice);

		if ("$32.39".equals("$" + finalPrice)) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}
	}

}
