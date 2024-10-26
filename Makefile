SRC_DIR := src/main/java/com/avajlauncher
BIN_DIR := com/
MAIN_CLASS := com.avajlauncher.Main

all: compile run

compile:
	find $(SRC_DIR) -name "*.java" | xargs javac -d .

run:
	java $(MAIN_CLASS)

clean:
	rm -rf $(BIN_DIR)

.PHONY: all compile run clean
