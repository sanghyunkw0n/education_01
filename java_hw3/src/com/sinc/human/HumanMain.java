package com.sinc.human;

public class HumanMain {

	public static void main(String[] args) {

		Human[] humanAry = new Human[3];

		Student stu = new Student("홍길동", 15, 171, 81, 201101, "영문");
		Student stu1 = new Student("한사람", 13, 183, 72, 201101, "건축");
		Student stu2 = new Student("임걱정", 16, 175, 65, 201101, "무용");

		humanAry[0] = stu;
		humanAry[1] = stu1;
		humanAry[2] = stu2;

		for (int i = 0; i < humanAry.length; i++) {
			System.out.println(humanAry[i].printInformation());
		}

	}

}
