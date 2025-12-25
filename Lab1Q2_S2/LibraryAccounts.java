public class LibraryAccounts {
	public static void main(String[] args) {
		
		Account account1,account2,account3;
		account1= new Account(4, "user1", 1);
		account2= new Account(4, "user2", 2);
		account3= new Account(4, "user3", 3);
		account2.takebook(5);
		account3.takebook(4);
		account2.takebook(1);
		account3.takebook(1);
		account2.changeName("user4");
		System.out.println(account1.toString());
		System.out.println(account2.toString());
		System.out.println(account3.toString());
	}
}