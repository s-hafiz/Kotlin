package referenceVariableArray;

public class BooksTestDrive {
	public static void main(String args[]){
		Books[] myBooks = new Books[3];
		
		int x = 0 ;
		
		myBooks[0] = new Books();
		myBooks[1] = new Books();
		myBooks[2] = new Books();
		
		myBooks[0].title = "The grapes of Java";
		myBooks[1].title = "The java Gatsby";
		myBooks[2].title = "The java cookbook";
		
		myBooks[0].author = "Bob";
		myBooks[1].author = "Sue";
		myBooks[2].author = "Ian";
		
		while(x<myBooks.length){
			System.out.print(myBooks[x].title);
			System.out.print(" by ");
			System.out.println(myBooks[x].author);
			x = x + 1;
		}//Loops ends here
	}//Main method ends here

}//Class ends here
