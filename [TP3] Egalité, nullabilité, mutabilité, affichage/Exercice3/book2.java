// LY-IENG Steven


/*public class Book2 {
  private final String title;
  private final String author;

  public Book2(String title, String author) {
    this.title = title;
    this.author = author;
  }
  
  public static void main(String[] args) {
    var book1 = new Book2("Da Vinci Code", "Dan Brown");
    var book2 = new Book2("Da Vinci Code", "Dan Brown");
    System.out.println(book1.equals(book2));
  }
}*/

//1 Quel est le problème ?
/*
On a en sortie False alors que l'on a le meme auteur pour book1 et book2
*/

//2 Comment corriger le problème si on s'entête à utiliser une classe ?
public class Book2 {
  private final String title;
  private final String author;


  public Book2(String title, String author) {
    this.title = title;
    this.author = author;
  }
  @Override
  public boolean equals(Object o){  // permet de verifier si deux auteur sont les memes
    return o instanceof Book2 book2
    &&author==book2.author;
  }

  public static void main(String[] args) {
    var book1 = new Book2("Da Vinci Code", "Dan Brown");
    var book2 = new Book2("Da Java Code", "Dan Brown");
    System.out.println(book1.equals(book2));
  }
}
