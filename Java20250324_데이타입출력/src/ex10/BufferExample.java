package ex10;

import java.util.Scanner;

/*
class Person{
private:
    char *name;
    int age;
public:
    Person(char *name, int age){
        int len = strlen(name);
        this->name = new char[len];
        strcpy(this->name, name);
        this->age = age;
    }
    Person(){
      name = NULL;
      age = 0;
      cout<<"Called Person()"<<endl;
    }

    void SetPersonInfo(char *name, int age){
      this->name = name;
      this->age = age;
    }

    void ShowPersonInfo() const{
        cout<<"Name: "<<name<<endl;
        cout<<"Age: "<<age<<endl;
    }

    ~Person(){
        delete []name;
        cout<<"Person Destructor"<<endl;
    }
};


int main() {

   Person parr[3];

    cout<<"-----------------------------"<<endl;
   char nameStr[100];
   char* strptr;
   int age;
   int len;

   for(int i = 0; i < 3; i++){
     cout<<"이름 : ";
     cin>>nameStr;
     cout<<"나이 : ";
     cin>>age;
     len = strlen(nameStr)+1;
     strptr = new char[len];
     strcpy(strptr, nameStr);
     parr[i].SetPersonInfo(strptr, age);
   }

   parr[0].ShowPersonInfo();
   parr[1].ShowPersonInfo();
   parr[2].ShowPersonInfo();

    return 0;
}

 */


class Person{

    private String name;
    private int age;

    Person(){
        System.out.println("Called Person()");
    }
    
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
   

    void SetPersonInfo(String name, int age){
      this.name = name;
      this.age = age;
    }

    void ShowPersonInfo() {
    	System.out.println("Name: " + name);
    	System.out.println("Age: " + age);
    }

}

public class BufferExample {
	public static void main(String[] args) throws Exception {
	  
	   Person[] parr = new Person[3];
	   
	   Scanner sc = new Scanner(System.in);
	  
	   for(int i = 0; i < 3; i++){
	     System.out.print("이름 : ");
	     String name = sc.nextLine();
	     System.out.print("나이 : ");
	     int age = Integer.parseInt(sc.nextLine());
	     
	     parr[i] = new Person(name, age);
	   }

	   parr[0].ShowPersonInfo();
	   parr[1].ShowPersonInfo();
	   parr[2].ShowPersonInfo();

	   return ;
	}
}


