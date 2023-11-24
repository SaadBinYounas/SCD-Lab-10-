public class Question1 {
    public int Add(int a, int b) {
        return a + b;
    }

    public float Add(float a, float b) {
        return a + b;
    }

    public int Add(String s1, String s2) {
        return Integer.parseInt(s1) + Integer.parseInt(s2);
    }

    public int Add(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp += arr[i];
        }
        return temp;
    }

    public int Add(int a, int b, int c) {
        return a + b + c;
    }

    public int Subtract(int a, int b) {
        return a - b;
    }

    public float Subtract(float a, float b) {
        return a - b;
    }

    public int Subtract(String s1, String s2) {
        return Integer.parseInt(s1) - Integer.parseInt(s2);
    }

    public int Subtract(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            temp -= arr[i];
        }
        return temp;
    }

    public int Subtract(int a, int b, int c) {
        return a - b - c;
    }

    public int Multiply(int a, int b) {
        return a * b;
    }

    public float Multiply(float a, float b) {
        return a * b;
    }

    public int Multiply(String s1, String s2) {
        return Integer.parseInt(s1) * Integer.parseInt(s2);
    }

    public int Multiply(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            temp *= arr[i];
        }
        return temp;
    }

    public int Multiply(int a, int b, int c) {
        return a * b * c;
    }

    public int Divide(int a, int b) {
        return a / b;
    }

    public float Divide(float a, float b) {
        return a / b;
    }

    public int Divide(String s1, String s2) {
        return Integer.parseInt(s1) / Integer.parseInt(s2);
    }

    public int Divide(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            temp /= arr[i];
        }
        return temp;
    }

    public int Divide(int a, int b, int c) {
        return a / b / c;
    }
}