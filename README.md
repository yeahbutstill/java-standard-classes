# java-standard-classes

## String Class

- String yang pernah dibahas dimateri Java Dasar, String adalah object, artinya dia memiliki representasi class nya
- Ada banyak sekali method yang bisa kita gunakan di String, kita bisa melihat detail method apa saja yang tersedia
  dihalaman dokumentasi javadoc nya.

## Method di String Class

| Method                    | Keterangan                                   |
|---------------------------|----------------------------------------------|
| String toLowerCase()      | Membuat string baru dengan format lower case |
| String toUpperCase()      | Membuat string baru dengan format upper case |
| int length()              | Mendapatkan panjang string                   |
| boolean startsWith(value) | Mengecek apakah dimulai dengan string value  |
| boolean endsWith(value)   | Mengecek apakah diakhiri dengan string value |
| String[] split(value)     | Memotong string dengan string value          |

## StringBuffer dan StringBuilder Class

## Immutable String

- String adalah tipe data immutable, artinya tidak bisa berubah isinya, saat kita mengubah string, sebenarnya yang
  dilakukan di Java adalah membuar String baru.
- Jika kita ingin memanipulasi String dalam jumlah banyak, sangat tidak disarankan menggunakan String, karena akan
  memakan memory yang cukup besar, untuk kasus seperti ini, disarankan menggunakan StringBuffer atau StringBuilder

## StringBuffer vs StringBuilder

- Kemampuan StringBuffer dan StringBuilder cukup sama, bisa digunakan untuk memanipulasi String
- Yang membedakan adalah, StringBuffer itu Thread Safe, sedangkan StringBuilder tidak Thread Safe
- Jika kita ingin memanipulasi String secara paralel bersamaan, disarankan menggunakan StringBuffer, namun jika tidak
  butuh paralel, cukup gunakan StringBuilder
- Karena StringBuffer dibuat agar Thread Safe, maka secara otomatis performanya lebih lambat dibandingkan StringBuilder

## StringJoiner Class

- StringJoiner adalah class yang bisa digunakan untuk membuat String sequence yang dipisahkan dengan delimiter(pemisah)
- StringJoiner juga mendukung prefix(depan) dan suffix(belakang) jika kita ingin menambahkannya
- Ini sangat bagus ketika ada kasus misalnya kita ingin mem-print Array dengan format yang kita mau misalnya

## StringTokenizer Class
- StringTokenizer class adalah class yang bisa digunakan untuk memotong String menjadi token atau String yang lebih kecil
- Kita bisa memotong String dengan delimiter yang kita mau


