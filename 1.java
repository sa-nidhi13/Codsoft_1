import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
        Random r = new Random();
        int a,b,i=5,h=100,l=1,w=0,sc=0,score=0;
		for(int c=1;c<=5;c++){
		    b=r.nextInt(h-l+1)+l;
			System.out.println("Game "+c);
		while(i>=1){
			System.out.println("You have "+i+" guesses left");
			System.out.print("Enter your guess:");
			a= s.nextInt();
			if(a==b){
				System.out.println("Your guess is RIGHT!");
				w++;
				score=w*i;
				i=5;
				w=0;
				break;
			}else if(0<a-b && a-b<5){
				System.out.println("Your guess is high but close"); 
			}
			else if(a-b>=5){
				System.out.println("Your guess is high");
			}else if(b-a<5){
				System.out.println("Your guess is low but close"); 
			}
			else{
				System.out.println("Your guess is low");
			}
			i--;
			if(i==0){
				System.out.println("All your guesses are over, the right number was:"+b);
				System.out.println("Your current score is:"+sc+"\n");
				break;
			}
		}if(i>=1){sc=sc+score;
		    System.out.println("Your current score is:"+sc+"\n");
		}i=5;
		}
	}
}