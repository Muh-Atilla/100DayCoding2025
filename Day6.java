public class Day6{
    public static void main(String[] args){
        // tipe data float
        float tinggi = 170.5f;
        float lebar = 4.5f;

        float volume = tinggi * lebar;
        System.out.println("tinggi:" + tinggi + "cm");
        System.out.println("lebar:" + lebar + "cm");
        System.out.println("volume : " + volume + "cm");

        // tipe data double
        double hargabarang = 19.000;
        double diskon = 0.1;
        double hargadiskon = hargabarang - (hargabarang * diskon);
        System.out.println("hargabarang: Rp" +hargabarang);
        System.out.println("harga setelah diskon Rp" + hargadiskon);



    }
}

