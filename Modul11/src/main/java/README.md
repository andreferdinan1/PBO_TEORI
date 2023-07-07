Extend dalam bahasa JAVA

Dalam bahasa pemrograman, kata kunci extends digunakan untuk melakukan pewarisan atau ekstensi dari kelas yang sudah ada (superclass) ke kelas baru (subclass). Konsep ini dikenal sebagai inheritance atau pewarisan.

Dengan menggunakan extends, kita dapat membuat hierarki kelas di mana subclass mewarisi atribut dan metode dari superclass-nya. Subclass kemudian dapat menambahkan perilaku atau atribut tambahan, atau mengubah perilaku yang ada dalam superclass.

Manfaat dari penggunaan extends antara lain:

Menghindari duplikasi kode: Ketika beberapa kelas memiliki atribut dan metode yang sama, kita dapat mengumpulkan mereka dalam superclass dan meng-extend superclass tersebut ke kelas-kelas lainnya. Dengan demikian, kita dapat menghindari duplikasi kode yang tidak perlu.

Reusabilitas kode: Dengan mewarisi atribut dan metode dari superclass, kita dapat memanfaatkan kembali kode yang sudah ada. Ini memungkinkan pengembang untuk memperluas atau memodifikasi perilaku yang ada tanpa perlu menulis ulang implementasi yang sama.

Polimorfisme: Dengan menggunakan inheritance, kita dapat membuat objek dari kelas subclass dan memperlakukannya sebagai objek dari kelas superclass. Ini memungkinkan kita untuk menggunakan polimorfisme, di mana objek dapat memiliki berbagai bentuk dan perilaku sesuai dengan hierarki kelas yang ada.

Penggunaan ABSTRAK CLASS

Dalam bahasa Java, kelas abstrak (abstract class) adalah kelas yang tidak dapat diinstansiasi secara langsung. Tujuannya adalah untuk menyediakan blueprint atau kerangka kerja bagi kelas-kelas turunannya (subkelas) yang akan mengimplementasikan metode-metode abstrak yang dideklarasikan dalam kelas abstrak tersebut. Berikut adalah beberapa penggunaan kelas abstrak dalam bahasa Java:

Mendefinisikan metode abstrak: Kelas abstrak dapat mengandung metode abstrak yang tidak memiliki implementasi. Subkelas yang mewarisi kelas abstrak tersebut wajib mengimplementasikan metode-metode abstrak tersebut. Dengan cara ini, kelas abstrak memberikan kerangka kerja untuk perilaku umum yang diharapkan, sementara detail implementasi dibiarkan pada subkelas.

Menggunakan pewarisan (inheritance): Kelas abstrak memungkinkan adanya hierarki kelas dengan pewarisan. Kelas abstrak dapat menjadi superclass bagi beberapa subkelas yang memiliki perilaku dan atribut yang mirip. Dengan mewarisi kelas abstrak, subkelas dapat memanfaatkan implementasi dan perilaku yang sudah ada dalam superclass.

Mengimplementasikan kontrak: Kelas abstrak dapat digunakan untuk menggambarkan sebuah kontrak atau spesifikasi yang harus dipenuhi oleh subkelasnya. Dengan menggunakan kelas abstrak, kita dapat memastikan bahwa subkelas mengimplementasikan metode-metode yang diperlukan sesuai dengan kontrak yang ditentukan dalam kelas abstrak.

Menghindari duplikasi kode: Dengan menerapkan metode-metode umum dalam kelas abstrak, kita dapat menghindari duplikasi kode di berbagai subkelas yang memiliki perilaku yang serupa. Dengan mengumpulkan implementasi yang sama dalam kelas abstrak, kita dapat memastikan bahwa kode yang sama hanya perlu ditulis sekali.

Penting untuk diingat bahwa kelas abstrak tidak dapat diinstansiasi langsung, sehingga tidak dapat dibuat objek dari kelas abstrak. Namun, kita masih dapat membuat referensi variabel dari tipe kelas abstrak dan menggunakannya untuk merujuk ke objek subkelas yang diinstansiasi.
