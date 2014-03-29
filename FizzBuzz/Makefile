CLASSPATH=.:../junit/hamcrest-core-1.3.jar:../junit/junit-4.11.jar


# ソースコード
SOURCE=MyFizzBuzz.java FizzBuzz.java

# テストクラスのソースコード
JUNITSOURCE=FizzBuzzTest.java
# テストクラス
JUNITCLASS=FizzBuzzTest

all: compile

compile:
	javac $(SOURCE)
	javac -cp $(CLASSPATH) $(JUNITSOURCE)

run:
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore $(JUNITCLASS)
