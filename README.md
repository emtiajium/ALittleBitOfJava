# একটুখানি জাভা #

আমরা যারা C/C++ প্রেমী তাদেরতো জাভা ভালো লাগার কোন কারণই থাকতে পারেনা, কিন্তু যখন দেখা যায় একটা সহজ প্রবলেম এর ক্যালকুলেশন করতে হবে স্ট্রিং দিয়ে তখনই মেজাজটা যায় বিগড়ে। আবার যখন দেখি জাভায় খুব সহজে এ কাজটা করা যায়, তখন মনে হয়, যাই এক কাপ [কফি](https://driftaway.coffee/coffee-called-java/) খেয়ে আসি আর জাভাটা শিখে ফেলি। কী আছে জীবনে!

তো তাহলে কী আর করা? একটু জাভা শিখতে হবে। তোমার যদি একটুর চেয়ে বেশী শিখতে মন চায় তাহলে এটা পড়ার মোটেই দরকার নেই।

প্রথমেই দেখি আউটপুট কীভাবে দেখাতে হয়।

```java
public class ShowOutput {

	public static void main(String cLA[]) {
	
		System.out.printf("Hello, World!\n");
		System.out.print("Hello," + " World!\n");
		System.out.println("Hello, World!");
	}
}
```

কী কোড দেখেই মন কচকচ করছে?

এটা কীইই? এতো পাবলিক, প্রাইভেট আসলো কোত্থেকে?
একটা বিল্ট-ইন আউটপুট ফাংশান লিখতে হবে, সেটাও এত্তো বড়!!
এতো ক্যাপিটাল, স্মল লেটারে লিখার তো আমার সময় নেই!!

আচ্ছা লিখেই যখন ফেললে, রান করেই দেখো আউটপুট কী আসে।

আউটপুট এইরকম ছাড়া আর কিছু আশা কর নাকি?

```java
Hello, World!
Hello, World!
Hello, World!
```

সোর্স ফাইলের নাম দিতে হবে কিন্তু `class` এর নামে। মানে ফাইলটার নাম হতে হবে `ShowOutput.java`।

এবার ডেটাটাইপ গুলোর উপর চোখ বুলিয়ে নেয়া যাক।

![alt tag](http://i.imgur.com/Sy3yoTw.jpg)

একটা বিষয় খেয়াল করেছ, C/C++ এর মতো কিন্তু ডেটা টাইপের সাইজ কিন্তু সিস্টেম ডিপেন্ডেন্ট না, specified।

জাভাতে ইনপুট নেয়ার সবচেয়ে সহজ উপায় হলো `Scanner` ব্যবহার করে নেয়া। তার জন্য তোমাকে নিচের স্ট্যাটমেন্টটা কষ্টকরে লিখে ফেলতে হবে।

```java
Scanner myInput = new Scanner(System.in);
```

এখানে `myInput` এর পরিবর্তে anantaJalil বা sakibKhan ও দিতে পারো, তোমার ইচ্ছা!

C/C++ এর মতো হেডার ফাইলও লাগবে একটা। সেটা নিচের মত।

```java
import java.util.Scanner;
```

তোমাদের ধৈর্যচ্যুতি হওয়ার আগেই ইনপুট নিয়ে ফেলি।

**ইন্টিজার**

```java
import java.util.Scanner;

public class IntegerInputOutput {

	public static void main(String cLA[]) {
		
		Scanner myInput = new Scanner(System.in);
		
		int firstNumber, secondNumber, summation;
		
		firstNumber = myInput.nextInt();
		secondNumber = myInput.nextInt();
		
		summation = firstNumber + secondNumber;
		
		System.out.printf("%d\n",summation);
		System.out.println(summation);
	}
}
```

**লঙ (ইন্টিজার)**

```java
import java.util.Scanner;

public class LongInputOutput {
	
	public static void main(String cLA[]) {
		
		Scanner myInput = new Scanner(System.in);
		
		long firstNumber, secondNumber, summation;

		firstNumber = myInput.nextLong();
		secondNumber = myInput.nextLong();
		
		summation = firstNumber + secondNumber;
		
		System.out.printf("%d\n", summation);
		System.out.printf(summation + "\n");
	}
}
```
**ডাবল**

```java
import java.util.Scanner;

public class DoubleInputOutput {
	
	public static void main(String cLA[]) {

		Scanner myInput = new Scanner(System.in);

		double firstNumber, secondNumber, summation;

		firstNumber = myInput.nextDouble();
		secondNumber = myInput.nextDouble();
		
		summation = firstNumber + secondNumber;
		
		System.out.printf("%.2f\n", summation);
		System.out.println(summation);
	}
}
```

**বুলিয়েন**

```java
import java.util.Scanner;

public class BooleanInputOutput {
	
	public static void main(String cLA[]) {
		
		Scanner myInput = new Scanner(System.in);
		
		boolean myBool = myInput.nextBoolean(); // true or false
		
		System.out.printf("%b\n", myBool);
	}
}
```

**কারেক্টার**

```java
import java.util.Scanner;

public class CharacterInputOutput {
	
	public static void main(String cLA[]) {
		
		Scanner myInput = new Scanner(System.in);
		
		char myCharacter = myInput.next().charAt(0);
		
		System.out.printf("%c\n", myCharacter);
		System.out.println(myCharacter);
	}
}
```

**স্ট্রিং**

```java
import java.util.Scanner;

public class StringInputOutput {
	
	public static void main(String cLA[]) {
		
		Scanner myInput = new Scanner(System.in);
		
		String stringOne, stringTwo;
		
		System.out.println("Enter string with space");
		stringOne = myInput.nextLine();
		System.out.printf("%s\n",stringOne);
		
		System.out.println("Enter string without space");
		stringTwo = myInput.next();
		System.out.println(stringTwo);
	}
}
```

**অ্যারে**

```java
import java.util.Scanner;

public class MyArray {
	
	public static void main(String cLA[]) {
		
		Scanner myInput = new Scanner(System.in);
		
		int arr[] = new int[101];
		
		int arraySize = myInput.nextInt();
		
		for(int i = 0; i < arraySize; i++) {
			arr[i] = myInput.nextInt();
			System.out.printf("%d ", arr[i]);
		}
	}
}
```

একইভাবে তুমি কারেক্টার অ্যারে অর্থাৎ, স্ট্রিংও ইনপুট নিতে পারো।

একটা বিষয় খেয়াল করেছ কী না জানিনা, যেখানে আউটপুট ফাংশান `printf()` শুধুমাত্র সেখানেই placeholder দিয়ে আউটপুট দেখানো যাচ্ছে, `print()` বা `println()` এ কিন্তু কাজ করবেনা।

এবার আসা যাক [যার জন্য আমাদের ব্যাকুল প্রতীক্ষা](https://soundcloud.com/kaniz-fatima-chhanda/shadhinota-ei-shobdoti-kivabe) সেই বিগইন্টিজারে।

```java
import java.util.Scanner;
import java.math.BigInteger;
// Another Header file

public class LoveWithBigInteger {
	
	public static void main(String cLA[]) {
		
		BigInteger aBigNumber;
		
		aBigNumber = BigInteger.valueOf(5); // within integer range
		System.out.printf("%d\n", aBigNumber);
		
		aBigNumber = new BigInteger("1234");
		System.out.println(aBigNumber);
	}
}
```

দেখি, বিগ ইন্টিজারের ইনপুট কীভাবে নেয়া যায়।

```java
import java.util.Scanner;
import java.math.BigInteger;

public class BigIntegerInputOutput {
	
	public static void main(String cLA[]) {
		
		Scanner myInput = new Scanner(System.in);
		
		BigInteger aBigNumber = myInput.nextBigInteger();
		System.out.printf("%d\n", aBigNumber);
	}
}
```

দুইটা ক্যাপিটাল লেটার লেগেছে! আচ্ছা সে যাই হোক, কিছু ফাংশানের কাজ শিখে ফেলি এইফাঁকে।

```java
import java.util.Scanner;
import java.math.BigInteger;

public class BuiltInBigIntegerFunction {
	
	public static void main(String cLA[]) {
		
		Scanner myInput = new Scanner(System.in);

		BigInteger aBigNumber = myInput.nextBigInteger();
		BigInteger anotherBigNumber = myInput.nextBigInteger();

		BigInteger summation = aBigNumber.add(anotherBigNumber);
		BigInteger subtraction = aBigNumber.subtract(anotherBigNumber);
		BigInteger multiplication = aBigNumber.multiply(anotherBigNumber);
		BigInteger division = aBigNumber.divide(anotherBigNumber);
		BigInteger remainder = aBigNumber.mod(anotherBigNumber);
		BigInteger gcd = aBigNumber.gcd(anotherBigNumber);

		System.out.printf("Summation %d\n", summation);
		System.out.printf("Subtraction %d\n", subtraction);
		System.out.printf("Multiplication %d\n", multiplication);
		System.out.printf("Division %d\n", division);
		System.out.printf("Modulus %d\n", remainder);
		System.out.printf("GCD %d\n", gcd);
	}
}
```

আরো ফাংশানের খোঁজ পেতে [এই](https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html) লিঙ্কে যেতে পারো।

যাক, অনেক বিরক্ত করলাম, আর একটু বিরক্ত করার সময় দাও, প্লিজ।

মনে কর, দুইটা ভ্যালু ইনপুট নিতে হবে, আর ইনপুট নেয়া শেষ হবে EOF দিয়ে, সেটা করতে হবে এইরকমভাবে।

```java
import java.util.Scanner;

public class EndOfFile {

	public static void main(String cLA[]) {
		
		Scanner input = new Scanner(System.in);
		
		int aNumber, anotherNumber;
		
		while(input.hasNextInt()) {
			aNumber = input.nextInt();
			anotherNumber = input.nextInt();
		}
	}
}
```

আবার মনে কর, ইনপুট ভ্যালু যত হবে ততোবার প্রসেস করতে হবে। `for()` লুপ দিয়ে করলে কোন সমস্যা নেই, কিন্তু `while()` লুপ দিয়ে করলে একটু ঢং করতে হবে। (জাভা বলে কথা, একটু আহ্লাদ করতেই পারে!)


```java
import java.util.Scanner;

public class KiddingWithWhile {
	
	public static void main(String cLA[]) {
		
		Scanner myInput = new Scanner(System.in);
		
		int howManyTimes = myInput.nextInt();
		
		while(howManyTimes-- > 0) {
			System.out.println("Do something");
		}
	}
}
```

আর একটা কথা। অনলাইন জাজগুলোতে সাবমিট করার আগে `class` এর নাম `Main` দিতে ভুলে যেওনা যেন।

কোড তো করবে, কিন্তু কোন আইডিই ইউজ করবে? দুনিয়ায় তো এটার অভাব নেই!

* প্রথমেই [Java Development Kit](http://www.oracle.com/technetwork/java/javase/downloads/index.html) ইন্সটল করতে হবে।
* এরপর কমান্ড প্রম্পট থেকে যাতে কাজ করা যায় তার ব্যবস্থা করতে হবে।
* আমার JDK ইন্সটল হয়েছে C:\Program Files\Java তে। Java ফোল্ডারের jdk1.6.0_14  ফোল্ডারের bin ফোল্ডারে জাভা ফাইল কম্পাইল করার জন্য ফাইলগুলো রয়েছে।
অর্থাৎ, লোকেশন হচ্ছে C:\Program Files\Java\jdk1.6.0_14\bin। তো এখন JDK এর Path সেট করার জন্য যেতে হবে: My Computer -> properties -> advanced system setting -> environment variable -> new
এখানে `variable name` এ PATH (কেজ সেনসিটিভ নয় কিন্তু এবং আগে থেকে থাকলে নতুন করে করা লাগবে না।), `variable value` এ `C:\Program Files\Java\jdk1.6.0_14\bin` দিতে হবে। আগে থেকে কিছু থেকে থাকলে সেমিকোলন দিয়ে তারপর দিতে হবে।
* এবার জাভা ফাইল কম্পাইল করার পালা। JDK এর সাথেই একটা কম্পাইলার (javac) রয়েছে। এটা দিয়ে করার জন্য যা করতে হবে: মনে করো তুমি D ড্রাইভের KiddingWithProgramming ফোল্ডারের Java ফোল্ডারের  Test.java ফাইলটিকে রান করতে চাও।
* কমান্ড প্রম্পট চালু করে `D:` লিখে এন্টার দাও। এখন তুমি D ড্রাইভে।
* `cd KiddingWithProgramming` লিখে এন্টার দাও। এখন তুমি KiddingWithProgramming ফোল্ডারে।
* `cd Java` লিখে এন্টার দাও। এখন তুমি Java ফোল্ডারে। (ফাইল লোকেশনে যাওয়ার ঝামেলা কমাতে `ShortCommand.bat` ফাইলটা ব্যবহার করতে পারো।)
* এবার কম্পাইল করার পালা। `javac Test.java` লিখে এন্টার দাও।
* এবার রান করার পালা। `java Test` লিখে এন্টার দাও। হয়ে গেলো। বারবার কমান্ড দিয়ে রান করা ঝামেলা। এজন্য তুমি [জিনি](https://www.geany.org/) আইডিই ব্যবহার করতে পারো খুবই কাজের সিম্পল একটা সফটওয়্যার। 

জিনি ব্যবহার করা অনেক সহজ, বিশেষত প্রজেক্ট ছাড়া একটা/একাদিক ফাইল রান করাতে, কিন্তু অনেক কাজ সহজে করতে, বিশেষত টাইপ কম করতে, [ইকলিপস](https://www.eclipse.org/downloads/) বা [নেটবিনস](https://netbeans.org/downloads/) ব্যবহার করতে পারো।

এবার, তাহলে কিছু প্রবলেম সল্ভ করে ফেলো। [ইউ-হান্টে](http://uhunt.felix-halim.net/) যাও, বাছাই কর, সাবমিট কর, AC পাও, কি সহজ!

কন্টেস্টে সাধারণত বিগ ইন্টিজারের প্রবলেম আসেনা, যদি আসে তাহলে প্রবলেমসেটারকে মনে মনে তুলোধুনো করে জাভায় করে ফেলবে আরকি!

আনন্দে থাকো, আর কোড করো। টাটা।

# ফুটনোট #

লেখাটা ফেইসবুকে দিয়েছিলাম ২০১৩ সালের ১১ জানুয়ারিতে। লেখাটা পড়ে কেউ কেউ ভুরু কুঁচকাতেও পারে, এই যে হেডার ফাইল লিখলাম, বা আরো কিছু বিষয়ে। কিন্তু অযথা নতুন কোন টার্ম আনতে চাইনি বলেই এভাবে দেয়া। আর একটা কথা, জাভায় ডুব দিতে চাইলে [হেড ফার্স্ট জাভা](https://www.goodreads.com/book/show/231262) দিয়ে শুরু করতে পারো।
