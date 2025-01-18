import java.util.Random;
class Main{
public static void main(String[] args){
Random random = new Random();
int[] numbers = new int[5];

for(int i = 0;i<numbers.length;i++){
numbers[i] = 100 + random.nextInt(900);
System.out.print(numbers[i] + " ");
}
System.out.println();
int min = numbers[0];
int max = numbers[0];

for(int num:numbers){
if(num<min){
min = num;
}
if(num>max){
max = num;
}
}
System.out.println("minimum value: "+min);
System.out.println("maximum value: "+max);
}
}
