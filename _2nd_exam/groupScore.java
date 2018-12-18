/*
  Variation of boyGirl.java
  but sorted by section, A & B
*/

public static void main(String[] args) {
  Scanner input = new Scanner(new File("myData.text"));

  while(input.hasNextLine()) {
    String text = input.nextLine();
    Scanner data = new Scanner(text);

    int a_sum = 0;
    int b_sum = 0;
    while(data.hasNext()) {
        String name = data.next();
        int score = data.nextInt();
        String section = data.next();

        if(section.equals("A")) {
          a_sum += data.nextInt();
        } else if(section.equals("B")) {
          b_sum += data.nextInt();
        }
    }
    System.out.println("A group total is: " + a_sum +
    "B group total is: " + b_sum);
  }
}
