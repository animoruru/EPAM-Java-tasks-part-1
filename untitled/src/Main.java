//Файли с заданиями: https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf

import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Линейные программы \n enter task number - ");
        int index = in.nextInt();
        switch(index) {
            case 1 : {
                double a,b,c;
                System.out.printf("enter a, b and c: ");
                a = in.nextDouble();
                b = in.nextDouble();
                c = in.nextDouble();
                double z=((a-3)*b/2)+c;
                System.out.printf("z=((a-3)*b/2)+c \n z=%f",z);
                break;
            }
            case 2 : {
                double a,b,c;
                System.out.printf("enter a (a!=0), b and c: ");
                a = in.nextDouble();
                b = in.nextDouble();
                c = in.nextDouble();
                double z=(b+Math.sqrt(b*b+4*a*c))/(2*a)-a*a*a*c+1/(b*b);
                System.out.printf("Answer is: %f",z);
                break;
            }
            case 3 : {
                double x,y;
                System.out.printf("enter x and y (cos(x)-sin(y)!=0): ");
                x = in.nextDouble();
                y = in.nextDouble();
                System.out.printf("Answer is: %f",(Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*(Math.sin(x*y)/Math.cos(x*y)));
                break;
            }
            case 4 : {
                double num;  //525.652
                double x;
                System.out.printf("enter number : ");
                x = in.nextDouble();
                num = (x * 1000) % 1000 + (int) x / 1000.0;
                System.out.println(num);
                break;
            }
            case 5 : {
                System.out.printf("enter time (seconds) : ");
                int time = in.nextInt();
                System.out.printf("Answer : %dч %dмин %dс", time/360, time%360/60, time%360%60);
                break;
            }
            case 6 : {
                System.out.printf("enter x and y : ");
                int x = in.nextInt();
                int y = in.nextInt();
                boolean result;
                if (y<=4 && y>=-3) {
                    if (x<=4 && x>=-4) {
                        if (x<=-2 || x>=2) {
                            if (y<=0) result=true;
                            else result=false;
                        } else result = true;
                    } else result = false;
                } else result=false;
                System.out.println(result);
                break;
            }
        }
        System.out.printf("\nПрограммы с ветвлением \n enter task number - ");
        index = in.nextInt();
        switch(index) {
            case 1: {
                System.out.printf("enter angel1 and angle2 : ");
                int ang1 = in.nextInt();
                int ang2 = in.nextInt();
                if (ang1 > 0 && ang2 > 0 && (ang1+ang2) < 180) {
                    if (ang1 + ang2 == 90 || ang1 == 90 || ang2 == 90) System.out.printf("Существует, прямоугольный");
                    else System.out.printf("Существует, не прямоугольный");
                } else System.out.printf("Не существует");
                break;
            }
            case 2 : {
                double a,b,c,d;
                System.out.printf("enter a, b, c and d : ");
                a = in.nextDouble();
                b = in.nextDouble();
                c = in.nextDouble();
                d = in.nextDouble();
                double min1, min2;
                if (a<b) min1=a;
                else min1 = b;
                if (c<d) min2=c;
                else min2=d;
                if (min1 > min2) System.out.printf("Answer is %f",min1);
                else System.out.printf("Answer is %f", min2);
                break;
            }
            case 3 : {
                System.out.printf("enter A(x1,y1), B(x2,y2) and C(x3,y3) : ");
                double x1,y1,x2,y2,x3,y3;
                x1 = in.nextDouble();
                y1 = in.nextDouble();
                x2 = in.nextDouble();
                y2 = in.nextDouble();
                x3 = in.nextDouble();
                y3 = in.nextDouble();
                if ((y3-y2)==(y2-y1) && (x3-x2)==(x2-x1)) System.out.printf("Все точки лежат на одной прямой");
                else System.out.printf("Точки не лежат на одной прямой");
                break;
            }
            case 4 : {
                System.out.printf("enter A and B : ");
                double a, b, x, y, z;
                a = in.nextDouble();
                b = in.nextDouble();
                System.out.printf("enter x, y and z : ");
                x = in.nextDouble();
                y = in.nextDouble();
                z = in.nextDouble();
                if ((x<=a && (y<=b || z<=b))||(y<=a && (x<=b || z<=b))||(z<=a && (x<=b || y<=b))) System.out.printf("Пройдет");
                else System.out.printf("Не, не пройдет");
                break;
            }
            case 5 : {
                System.out.printf("enter x : ");
                double x = in.nextDouble();
                if (x <= 3) System.out.printf("Answer is : %f", x*x-3*x+9);
                else System.out.printf("Answer is : %f", 1/(x*x*x + 6));
                break;
            }
        }
        System.out.printf("\nПрограммы с циклами \n enter task number - ");
        index = in.nextInt();
        switch(index) {
            case 1 : {
                System.out.printf("enter number : ");
                int x = in.nextInt();
                int sum=0;
                for (int i=1; i<=x;i++) {
                    sum+=i;
                }
                System.out.printf("The summary is : %d", sum);
                break;
            }
            case 2 : {
                System.out.printf("enter a, b (a<b) and h : ");
                double a, b, h;
                a = in.nextDouble();
                b = in.nextDouble();
                h = in.nextDouble();
                for (double i=a; i<=b; i+=h) {
                    if (i<=2) System.out.printf("\n x = %f, func = %f ",i,-i);
                    else System.out.printf("\n x = %f, func = %f ",i,i);
                }
                break;
            }
            case 3 : {
                int sum=0;
                for (int i = 1; i<=100; i++) {
                    sum+=i*i;
                }
                System.out.printf(" Summary is : %d",sum);
                break;
            }
            case 4 : {
                BigInteger multiplier=BigInteger.valueOf(1);
                BigInteger increment=BigInteger.valueOf(1);
                BigInteger ans=BigInteger.valueOf(1);
                for (int i = 1; i<=200; i++) {
                    BigInteger temp=multiplier;
                    ans=ans.multiply(temp.multiply(temp));
                    multiplier=multiplier.add(increment);
                }
                System.out.printf(" ANSWER IS ->  %d",ans);
                break;
            }
            case 5 : {
                System.out.printf("enter e : ");
                double e = in.nextDouble();
                double sum=0;
                double a = 1/2.0 + 1/3.0;
                if (e<=0) System.out.printf("Summary = 1.5");
                else {
                    for (int i=1;a>=e;i++) {
                        sum+=a;
                        a=1/Math.pow(2,i+1) + 1/Math.pow(3,i+1);
                    }
                    System.out.printf(" Summary = %f", sum);
                }
                break;
            }
            case 6 : {
                for (int i = 32; i <= 126; i++) {
                    System.out.println(i + " " + (char) i);
                }
                break;
            }
            case 7 : {
                System.out.printf("enter m and n : ");
                int m = in.nextInt();
                int n = in.nextInt();
                for (int i=m;i<=n;i++) {
                    System.out.printf("\n Number %d dividers :",i);
                    for (int del = 2; del<i;del++) {
                        if (i%del==0) System.out.printf("\n  %d", del);
                    }
                }
                break;
            }
            case 8 : {
                System.out.printf("enter a and b : ");
                int a = in.nextInt();
                int b = in.nextInt();
                System.out.printf(" %d: \n ",a);
                int deg=0;
                for (int temp = a;temp!=0;temp/=10, deg++);
                for (int i = 0;i<deg;i++) {
                    System.out.printf(" %d", (int)(a%Math.pow(10, deg-i)/Math.pow(10,deg-i-1)));
                }

                System.out.printf("\n %d: \n ",b);
                deg=0;
                for (int temp = b;temp!=0;temp/=10, deg++);
                for (int i = 0;i<deg;i++) {
                        System.out.printf(" %d", (int)(b%Math.pow(10, deg-i)/Math.pow(10,deg-i-1)));
                    }
            }
        }
        in.close();
    }
}