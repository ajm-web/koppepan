CLASSPATH=.:../junit/hamcrest-core-1.3.jar:../junit/junit-4.11.jar


# ソースコード
SOURCE=MaxRouteLength.java

# テストクラスのソースコード
JUNITSOURCE=MaxRouteLengthTest.java
# テストクラス
JUNITCLASS=MaxRouteLengthTest

all: compile

compile:
	javac $(SOURCE)
	javac -cp $(CLASSPATH) $(JUNITSOURCE)

run:
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore $(JUNITCLASS)
