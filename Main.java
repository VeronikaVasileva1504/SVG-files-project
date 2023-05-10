public class Main {
        public static void main(String[] args) {
            if (args.length == 0) {
                System.out.println("Usage: SvgCommander <command>");
                return;
            }

            String command = args[0];
            switch (command) {
                case "open":
                    // Parse additional command-line arguments as needed
                    openSvg(args[1]);
                    break;
                case "close":
                    // Parse additional command-line arguments as needed
                    //closeSvg(args[1]);
                    break;
                case "save":
                    // Parse additional command-line arguments as needed
                    saveSvg(args[1]);
                    break;
                case "save as":
                    // Parse additional command-line arguments as needed
                   // saveSvg(args[1]);
                    break;
                case "print":
                    // Parse additional command-line arguments as needed
                    printSvg(args[1]);
                    break;
                case "create":
                    // Parse additional command-line arguments as needed
                    printSvg(args[1]);
                    break;
                case "erase":
                    // Parse additional command-line arguments as needed
                    printSvg(args[1]);
                    break;
                case "translate":
                    // Parse additional command-line arguments as needed
                    printSvg(args[1]);
                    break;
                case "within":
                    // Parse additional command-line arguments as needed
                    printSvg(args[1]);
                    break;
                case "help":
                    printHelp();
                    break;
                case "exit":
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid command: " + command);
                    break;
            }
        }

        private static void openSvg(String filename) {
            // Implement the "open" command here
        }

        private static void saveSvg(String filename) {
            // Implement the "save" command here
        }

        private static void printSvg(String filename) {
            // Implement the "print" command here
        }

        private static void printHelp() {
            System.out.println("This program have functions :");
            System.out.println("  open - Open an SVG file");
            System.out.println("  close - Close a SVG file");
            System.out.println("  save - Save a SVG file");
            System.out.println("  save as - Save a SVG file");
            System.out.println("  print - Print a SVG file");
            System.out.println("  create - Create a SVG file");
            System.out.println("  erase - Erase an SVG file");
            System.out.println("  translate - Translate a SVG file");
            System.out.println("  within - Print all figures from region");
            System.out.println("  help - Show this help message");
            System.out.println("  exit - Exit of program");


        }
    }
