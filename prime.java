class Main{
public static void main(String[] args){
System.out.println("Prime number between 1 and 10 are: ");
for(int num = 1;num<=10;num++){
if(isPrime(num)){
System.out.print(num + " ");
}
}
}
public static boolean isPrime(int n){
if(n<=1){
return false;
}
for(int i = 2;i<=Math.sqrt(n);i++){
if(n%i == 0){
return false;
}
} 
return true;
}
}

