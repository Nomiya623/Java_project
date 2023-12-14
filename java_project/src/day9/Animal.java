package day9;

public class Animal {
	// 4. "동물 이름은 000입니다"출력

	String name;
	int age;

	public Animal() {
	}

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void print() {
		System.out.println("동물 이름은 " + name + " 입니다.");
	}
}