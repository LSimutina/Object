public enum Enum{
    Case1 {
        int method (int x, int y) {
            return x+y;
        }
    },
    Case2 {
        int method (int x, int y) {
            return x-y;
        }
    },
    Case3 {
        int method (int x, int y) {
            return x*y;
        }
    },
    Case4 {
        int method (int x, int y) {
            return x/y;
        }
    };
    abstract int method(int x, int y);
}