public class Day14 {
    public static void main(String[] args) {
        // String yang akan diubah
        String strInt = "123";
        String strDouble = "123.45";
        String strBoolean = "true";

        // Mengubah String ke int
        int angkaInt = Integer.parseInt(strInt);
        // Mengubah String ke double
        double angkaDouble = Double.parseDouble(strDouble);
        // Mengubah String ke boolean
        boolean nilaiBoolean = Boolean.parseBoolean(strBoolean);

        // Output hasil konversi
        System.out.println("String ke int: " + angkaInt);
        System.out.println("String ke double: " + angkaDouble);
        System.out.println("String ke boolean: " + nilaiBoolean);
    }
}