//자료구조(6007) 과제 #2 (60231222)
package arcktect;

public class Main {

	public static void main(String[] args) {
	    SList<String> s = new SList<String>();

	    System.out.println("<<자료구조(6006/6007) 과제 2 (이름 학번)>>");
	    System.out.println("---------------------------\n");

	    System.out.println("1> 5개의 원소 삽입");
	    s.insertFront("banana");
	    s.insertFront("grape");
	    s.addLast("tomato");
	    s.addLast("apple");
	    s.addLast("mango");
	    s.print();

	    int index = s.search("banana");
	    System.out.printf("2> banana(index %d) 뒤에 cherry 삽입\n", index);
	    s.add("cherry", index + 1);
	    s.print();

	    index = s.search("apple");
	    System.out.printf("3> apple(index %d) 앞에 melon 삽입\n", index);
	    s.add("melon", index);
	    s.print();

	    System.out.printf("4> index 3으로 peach 삽입\n");
	    s.add("peach", 3);
	    s.print();

	    index = s.search("tomato");
	    System.out.printf("5> tomato(index %d) 뒤의 항목 삭제\n", index);
	    s.deletAfter(s.getNode(index));
	    s.print();

	    System.out.printf("6> banana 항목 삭제\n");
	    s.deleteItem("banana");
	    s.print();

	    System.out.printf("7> index 3 항목 삭제\n");
	    s.delete(3);
	    s.print();

	    System.out.println("8> 맨 앞의 원소 3개 제거");
	    s.deleteFront();
	    s.deleteFront();
	    s.deleteFront();
	    s.print();
	}
}