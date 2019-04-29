package com.example.budkitapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Dashboard extends Fragment {
    RecyclerView recyclerView;
    eventNewsAdapter adapter;
    List<eventNews> eventNewsList;

    public Dashboard() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        eventNewsList = new ArrayList<>();

        recyclerView =(RecyclerView) view.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        eventNewsList.add(new eventNews(
                1,
                "Dieng Culture Festival (DCF) 2019 ",
                "SEMARANG (Asatu.id) – Dieng Culture Festival (DCF) 2019 yang diselenggarakan oleh Komunitas Dieng Pandawa, akan berlangsung mulai Jumat sampai Minggu (3-5/8). Dieng Pandawa adalah sebuah kelompok sadar wisata (Pokdarwis) di Desa Dieng Kulon, Kecamatan Batur, Banjarnegara.\n" +
                        "Kepala Bidang Pemasaran Dinas Pemuda Olahraga dan Pariwisata (Disporapar) Jawa Tengah, Ida Bagus Ketut Alamsyah, menyatakan, sejumlah agenda sudah disiapkan untuk digelar pada DCF yang tahun ini memasuki penyelenggaraan ke sembilan.\n" +
                        "Agenda itu dimulai pada Jumat (3/8), yaitu Aksi Dieng Bersih, Festival Caping dan Bunga, Pameran Produk UKM dan Kuliner, Festival Jazz Atas Awan, dan Festival Kembang Api.\n" +
                        "Kemudian pada Sabtu (4/8), Gubernur Jawa Tengah Ganjar Pranowo akan membuka acara yang diawali dengan Festival Tumpeng, Kirab Budaya, Sendra Tari Rambut Gembel, Senandung Negeri Atas Awan, serta Festival Lampion.\n" +
                        "Dan pada hari terakhir, Minggu (5/8), akan diadakan Jamasan Rambut Gembel dan Prosesi Ruwatan Cukur Rambut Gembel. Diperkirakan, puncak kunjungan wisatawan akan memenuhi prosesi tersebut.\n" +
                        "“Magnet wisatawan akan mencapai puncaknya pada prosesi ruwatan cukur gembel yang diawali dengan jamasan,” terang Alamsyah.\n" +
                        "Puncak prosesi tersebut akan diselenggarakan di Kompleks Candi Arjuna. Sedangkan seluruh kegiatan akan melibatkan masyarakat Dieng di kawasan Kabupaten Banjarnegara, Wonosobo, dan Batang.\n" +
                        "Untuk para wisatawan yang akan menyaksikan pergelaran DCF dengan memesan tiket online, Alamsyah mewanti-wanti agar berhati-hati dengan promo abal-abal yang biasanya memanfaatkan event ini.\n" +
                        "Pasalnya, sejumlah wisatawan dari Jakarta sempat tertipu dengan biro wisata abal-abal yang turut menjual event DCF 9 ini.\n" +
                        "“Lebih baik langsung menghubungi panitia melalui website resmi di www.diengpandawa.com atau www.dieng.id,” tegasnya.\n",
                R.drawable.dcf1));

        eventNewsList.add(
                new eventNews(
                        2,
                        "Festival Teluk Tomini di Kabupaten Bolaang",
                        "Jakarta, airmagz.com – Festival Teluk Tomini (FTT) 2019 segera digelar di Kabupaten Parigi Moutong, Provinsi Sulawesi Tengah, 19-22 April mendatang. Seperti biasa, acara akan dimeriahkan dengan berbagai kegiatan menarik. Mulai dari Pemilihan Putra Putri Bahari, Fashion Carnival, Lomba Fotografi Objek Wisata, Festival Musik Tradisional, serta Festival Kuliner dan Pameran Kerajinan Rakyat.\n" +
                                "Berangkat dari berbagai kekayaan dan keunikan Sumber Daya alam yang dimiliki Kabupaten Parigi Moutong, maka pada pelaksanaan Festival Teluk Tomini Tahun 2019 kali ini mengangkat Tema : “Parigi Moutong Truly Indonesia” merupakan rangkaian kesatuan kalimat yang memberikan makna, Bahwa Parigi Moutong salah satu Daerah yang berada di Indonesia yang memiliki keindahan alam yang mempesona.\n" +
                                "Selain itu juga, tema ini memiliki spirit yang sama dan sejalan dengan branding Promosi Pariwisata Nusantara yang diusung oleh Kementerian Pariwisata Republik Indonesia yaitu : “PESONA INDONESIA”.\n" +
                                "Dari Tagline Kementerian ini memberikan pesan dan motivasi bagi setiap daerah di Indonesia untuk terus melakukan upaya-upaya promosi berbagai potensi yang menjadi Daya Tarik Pariwisata baik kepada wisatawan nusantara maupun mancanegara.\n" +
                                "Staf Khusus Menteri Bidang Multikultural Kemenpar Esthy Reko Astuti mengatakan, FTT adalah kegiatan rutin tahunan yang masuk Calendar of Event (CoE) Kementerian Pariwisata. Sesuai nama kegiatan, event ini digelar untuk mengeksplor Teluk Tomini agar lebih dikenal masyarakat luas. Dengan festival ini, diharapkan kunjungan wisatawan semakin meningkat, baik wisatawan lokal maupun mancanegara.\n" +
                                "“Teluk Tomini adalah aset berharga bagi sektor pariwisata Indonesia. Di sini, wisatawan bisa melakukan aktivitas snorkeling untuk menikmati keindahan bawah laut. Bagi yang suka memancing, Teluk Tomini juga memiliki spot-spot yang bagus untuk berburu strike,” ujarnya, Jumat (5/4).\n" +
                                "Adapun maksud dan tujuan diadakannya Festival Teluk Tomini antara lain:\n" +
                                "•\tMempromosikan Pariwisata Parigi Moutong melalui Event  Festival Teluk Tomini Tahun 2019\n" +
                                "•\tMembangkitkan iklim kemitraan antara Pemerintah, Stakeholder dan Masyarakat\n" +
                                "•\tMerangsang kunjungan Wisatawan Nusantara dan Wisatawan Mancanegara;\n" +
                                "•\tMenggalangkan rasa memiliki dan persaudaraan dalam Festival Pesona Teluk Tomin.\n" +
                                "•\tMewujudkan ketahanan budaya dan memperkaya khasanah budaya di Sulawesi Tengah\n" +
                                "•\tMenjadikan Parigi Moutong sebagai destinasi wisata nusantara dan mancanegara;\n" +
                                "•\tMenggali minat dan bakat pelaku seni professional iklim dan peluang bisnis bagi UMKM dan Pengusaha\n" +
                                "•\tSebagai ajang promosi daerah untuk program pemerintah yaitu “Pesona Indonesia”\n" +
                                "Seperti event pariwisata lain, Festival Teluk Tomini juga memiliki keistimewaan tersendiri. Biasanya, wisatawan yang datang tak hanya para pelancong lokal, tetapi ada pula turis mancanegara. Dengan kata lain, kegiatan ini juga berpotensi mendulang wisman ke Indonesia.\n" +
                                "Tahun lalu, puncak Festival Teluk Tomini dimeriahkan dengan beragam acara. Antara lain pawai kostum karnaval, parade vespa, parade motor tua, lomba perahu hias, serta pentas musik yang menghadirkan artis lokal. Tahun ini, kegiatan yang dihelat kemungkinan masih sama. Hanya saja, ada hal-hal khusus yang menjadi pembeda, agar jalannya event tak terkesan monoton.\n" +
                                "Festival Teluk Tomini masuk dalam kategori wisata bahari dan budaya. Belakangan, jenis wisata bahari sangat digandrungi karena banyak aktivitas yang bisa dilakukan. Tak hanya bersantai menikmati keindahan pantai, wisatawan juga bisa melakukan kegiatan lain sesuai dengan potensi objek wisata yang bersangkutan. Bisa diving, snorkeling, memancing, bahkan di pantai-pantai tertentu bisa digunakan untuk surfing.\n" +
                                "“Sebagai negara kepulauan, Indonesia memiliki banyak objek wisata pantai yang indah dan potensial. Pantai dan laut menjadi salah satu kekayaan yang bisa digarap untuk menopang sektor pariwisata Indonesia, seiring dengan meningkatnya target kunjungan wisman sebesar 20 juta sepanjang tahun 2019,” jelasnya.\n" +
                                "Menteri Pariwisata Arief Yahya mengatakan, potensi pariwisata bahari Indonesia perlu dikembangkan lebih maksimal. Sebagai negara kepulauan, wisata bahari dinilai mampu memberi pemasukan yang cukup signifikan bagi Indonesia.\n" +
                                "“Kekayaan bahari Indonesia amat beragam. Selain pantai, 70 persen jenis koral yang hidup di dunia terdapat di Indonesia. Sayangnya, kelebihan itu belum dikelola dengan baik, sehingga tidak memberi dampak positif bagi perekonomian negara dan kesejahteraan masyarakat. Perlu terobosan yang lebih efektif untuk mendorong kemajuan wisata bahari kita,” tegasnya. (IMN/Pemkab Parigi Moutong/Merdeka.com)\n",
                        R.drawable.teluktomini3));

        eventNewsList.add(
                new eventNews(
                        3,
                        "Festival Parade 1001 Kuda Sandelwood dan Tenun Ikat 2019 di NTT",
                        "Pulau Sumba yang indah, di Provinsi Nusa Tenggara Timur, akan kembali disorot dengan atraksi spektakuler yang melibatkan lebih dari seribu kuda terbaik di pulau ini ketika Festival Parade 1001 Kuda Sandalwood berlangsung pada tanggal 5 Juli hingga 13 Juli 2019. Menyusul keberhasilan tahun lalu , tradisi yang benar-benar istimewa ini telah berkembang menjadi acara tahunan yang sangat dinanti oleh para wisatawan dari seluruh dunia.\n" +
                                "Selama festival, kuda-kuda akan didekorasi dengan berbagai aksesoris dan dekorasi berkilau yang unik sementara penunggang mengenakan kostum tradisional pulau yang berbeda. Dibagi menjadi kelompok-kelompok, tim kuda dan penunggang kemudian akan bersaing di depan panel juri berdasarkan kriteria yang mencakup keterampilan kecantikan, kinerja, dan manajemen kuda.\n" +
                                "Bagi Anda yang ingin merasakan sensasi menunggang kuda Sandalwood yang terkenal, panitia juga telah menyiapkan kuda untuk wisatawan yang dapat membawa mereka ke banyak tujuan menakjubkan Sumba di seluruh pulau.\n" +
                                "Menambah perayaan, acara akan dikombinasikan dengan Tenun Ikat kain tenun tradisional yang Sumba terkenal, yang akan menampilkan pengrajin tenun terbaik tidak hanya dari Sumba tetapi juga dari pulau lain di provinsi Nusa Tenggara Timur. Festival Tenun Ikat Kain Tenun Tradisional akan diadakan di Tambolaka dan akan menampilkan banyak program menarik termasuk peragaan busana dan pertunjukan tari tradisional Sumba yang luar biasa.\n" +
                                "Penanggung jawab Kalender Acara di Kementerian Pariwisata, Esthy Reko Astuti menyatakan penghargaannya dan berharap bahwa kedua acara tersebut dapat lebih meningkatkan pariwisata pulau ini. \"Saya yakin bahwa kedua acara ini akan semakin memperkuat merek pariwisata Sumba dan Nusa Tenggara Timur khususnya dan Indonesia secara keseluruhan. Ini juga akan menambah daya tarik yang sudah berwarna-warni di Sumba seperti Festival Pasola, Situs Megalitik, dan keunikannya. Budaya Marapu, dan lainnya \"kata Esthy Reko Astuti.\n" +
                                "Menghadap Samudera Hindia yang luas, pulau Sumba yang terletak di dekat Pulau Komodo di provinsi Nusa Tenggara Timur mungkin telah menjadi lebih populer sebagai surga peselancar dan tempat persembunyian terpencil yang eksklusif. Namun, Sumba selama berabad-abad dikenal sebagai Pulau Sandalwood karena kayu harumnya yang dicari terutama oleh bangsawan Cina. Karena alasan ini, kuda Sumba yang gesit disebut Sandalwood Ponies yang paling populer untuk pacuan kuda. Kuda-kuda ini adalah puncak dari tradisi tahunan yang menarik dari Festival Pasola.\n" +
                                "Kuda Sandalwood mendapatkan namanya dari pohon cendana yang dulu tumbuh subur di Sumba dan sudah lama dikaitkan dengan pulau itu. Di Cina, kayu harum ini digunakan untuk membuat peti harta karun berukir indah untuk melestarikan konten berharga mereka dari pembusukan dan serangga.\n" +
                                "Kuda Sandalwood adalah salah satu jenis kuda terbaik di Indonesia, sebagian karena fakta bahwa ini adalah jenis campuran dengan kuda-kuda Arab. Mereka sangat populer di pacuan kuda, baik di flat atau di harness. Mereka juga digunakan dalam pacuan tanpa pelana yang diadakan di pulau-pulau, dengan trek yang sering mencakup lebih dari tiga mil. Secara tradisional, Sandalwood digunakan untuk pekerjaan ringan, pak, pertanian, dan berkuda.\n" +
                                "Untuk mencapai Sumba, Garuda Indonesia memiliki penerbangan reguler ke Tambolaka dari Jakarta dengan singgah di Bali, sementara beberapa maskapai melayani rute Bali-Waingapu.\n" +
                                "\n",
                        R.drawable.kuda2));
        eventNewsList.add(
                new eventNews(
                        4,
                        "NTB Matangkan Persiapan Pesona Khazanah Ramadhan",
                        "REPUBLIKA.CO.ID, MATARAM -- Pemerintah Provinsi Nusa Tenggara Barat (NTB) akan menyelenggarakan ajang Pesona Khazanah Ramadhan (PKR) pada bulan suci Ramadhan tahun ini. Ajang PKR yang memasuki tahun kedua akan menghadirkan dua imam besar asal Mesir, satu imam besar dari Maroko, dan satu imam besar berkebangsaan Yordania.\n" +
                                " \n" +
                                "Panitia PKR Fauzan Zakaria mengataka,n kegiatan ini untuk mengisi aktivitas bulan puasa di Lombok. Pria yang juga menjabat sebagai Ketua Asosiasi Pariwisata Islami Indonesia (APII) mengatakan, keempat imam besar negara Timur Tengah ini akan mengimami shalat tarawih di Masjid Hubbul Wathan, Islamic Center NTB selama Ramadhan berlangsung hingga mengimami shalat idhul fitri.\n" +
                                " \n" +
                                "\"Kami ingin menghadirkan sensasi bulan suci Ramadhan serasa di Mekah Al Mukarromah dengan menghadirkan imam-imam besar dari tiga negara. Secara tidak langsung kami juga mengundang umat Muslim di seluruh nusantara untuk hadir di Lombok selama Ramadhan nanti,\" unar Fauzan saat meninjau venue perhelatan agenda Pesona Khazanah Ramadhan, Sabtu (21/4).\n" +
                                " \n" +
                                "Selain imam besar dari tiga negara itu, Fauzan yang juga lulusan Universitas Al Azhar akan mengundang Ustaz Abdul Somad (UAS) sebagai salah satu penceramah dalam rangkaian kegiatan PKR#2 dan para ulama lainnya. \"Ustadz Abdul Somad kita minta menjadi penceramah pada peringatan Nuzulul Quran dalam kemasan acara Tabligh Akbar,\" lanjut Fauzan.\n" +
                                " \n" +
                                "Fauzan menambahkan, PKR 2018 tahun ini juga akan menghadirkan sejumlah Qori internasional pada bulan turunnya Alquran nanti. \"Kami ingin memberi nuansa berbeda untuk agenda PKR kali ini agar berbeda dengan tahun lalu. Kami ingin menghadirkan lebih banyak tamu dan ulama, agar di bulan Ramadhan nanti, tidak ada istilah low season untuk pariwisata Lombok Sumbawa,\" ucap Fauzan.\n" +
                                " \n" +
                                "Agenda Pesona Khazanah Ramadhan juga akan diramaikan dengan kegiatan tambahan berupa bazaar, pameran buku dan berbagai prodak khas Lombok Sumbawa. Ada juga bazar paket wisata dengan melibatkan pelaku asosiasi yang ada di NTB dan nusantara.\n" +
                                " \n" +
                                "Untuk memberi kesan lebih mendunia, Fauzan mengaku, tengah berupaya melakukan komunikasi dengan sejumlah media besar Timur Tengah untuk datang meliput acara ini. \"Semaksimal mungkin kami akan berusaha agar gaung pesona khazanah ramadhan ini bisa lebih dikenal secara internasional. Dampak yang paling penting adalah Pesona Khazanah Ramadhan mampu memberikan dampak spiritualitas yang menjadi ciri wisata halal Lombok Sumbawa,\" kata dia.\n" +
                                "\n",
                        R.drawable.pkr1));
        eventNewsList.add(
                new eventNews(
                        5,
                        "Pilpres 2019 sebagai Katalis Ekonomi",
                        "Jakarta -\n" +
                                "Pemilihan Umum Presiden 2019 mendekati tahapan akhir. Debat demi debat capres dan cawapres yang sangat menarik telah kita ikuti bersama. Yang lebih penting untuk dinantikan adalah sejauh mana dampak pilpres terhadap ekonomi Indonesia. It's the economy!\n" +
                                "\n" +
                                "The Next Big Thing\n" +
                                "\n" +
                                "Pertumbuhan ekonomi 2018 yang dirilis BPS berada di angka 5.17%, yang lebih baik daripada 2017 (5.07%). Pertumbuhan ekonomi beberapa tahun terakhir berada di sekitar 5% yang bisa dikatakan the new normal. Pesatnya pembangunan belakangan ini, khususnya di bidang infrastruktur, tidak cukup signifikan dalam menaikkan angka pertumbuhan ekonomi atau bisa dikatakan diminishing return ataupun kurang produktif. Utang yang bertambah, walaupun secara angka rasio terhadap GDP masih aman, tidak menyebabkan multiplier effect yang signifikan terhadap ekonomi. Kebijakan reformasi fiskal yang ditandai dengan tax amnesty juga tidak berpengaruh banyak dalam menaikkan rasio pajak terhadap PDB.\n" +
                                "\n" +
                                "Terakhir kali pertumbuhan ekonomi Indonesia di atas 6% disebabkan oleh commodity boom yang sayangnya kurang dimanfaatkan dalam membangun fundamental ekonomi di masa lampau. Oleh karena itu diperlukan strategi baru yang efektif untuk menaikkan tingkat pertumbuhan ekonomi Indonesia, atau bisa jadi diperlukan perubahan yang cukup radikal terhadap ekonomi Indonesia supaya tumbuh lebih tinggi di masa depan. Kita sangat perlu melakukan penguatan komponen-komponen ekonomi dalam negeri supaya Indonesia dapat menjadi the next big thing.\n" +
                                "\n" +
                                "Keunggulan Kompetitif\n" +
                                "\n" +
                                "Jika ditelisik dari komponen PDB, shifting ke sektor industri dan jasa dari sektor pertanian masih belum cukup baik. Hal ini dibuktikan dengan komponen PDB dari sektor pertanian yang masih cukup tinggi (di atas 10%). Perpindahan dari sektor pertanian harus berjalan lebih cepat agar dapat meningkatkan produktivitas masyarakat, tanpa mengurangi kesejahteraan para petani. Di kebanyakan negara maju, ekonomi sangat menitikberatkan kepada sektor industri dan jasa.\n" +
                                "\n" +
                                "Adapun di komponen PDB dari end use, konsumsi rumah tangga masih menjadi andalan, diikuti oleh investasi. Ke depannya perlu dipikirkan kebijakan untuk menumbuhkan investasi supaya dapat menstimulasi konsumsi yang pada akhirnya menumbuhkan ekonomi. \n" +
                                "\n" +
                                "Diperlukan investasi yang cukup besar, khususnya Foreign Direct Investment(yang saat ini masih di kisaran 2% dari PDB) yang berdampak langsung terhadap ekonomi, agar dapat menumbuhkan ekonomi di atas 6% atau lebih tinggi lagi, siapapun presidennya. Kebijakan suku bunga yang tidak terlalu tinggi, keringanan pajak kepada investasi baru, kemudahan izin (ease of doing business, yang saat ini masih di peringkat 70-an), kepastian hukum, pembangunan infrastruktur yang lebih terarah dan efektif, maupun pembukaan pusat-pusat industri baru sangat dibutuhkan untuk menumbuhkan ekonomi lebih tinggi lagi. \n" +
                                "\n" +
                                "Kita perlu menemukan dan memfokuskan keunggulan kompetitif kita dibandingkan negara lain demi kemajuan Indonesia.\n" +
                                "\n" +
                                "Nilai Tambah\n" +
                                "\n" +
                                "Pertumbuhan di masa depan wajib memfokuskan kepada nilai tambah (value added) yang dapat diberikan kepada barang dan jasa. Kita tidak bisa lagi hanya bersandar kepada sumber daya alam mentah yang dijual murah di pasar. Era commodity boom sudah berakhir. Harga komoditas yang fluktuatif dan adanya perang dagang antara Amerika Serikat dan China sangat rentan mempengaruhi Indonesia yang secara ekonomi termasuk dalam weak open economy. \n" +
                                "\n" +
                                "Infrastruktur yang dibangun cukup masif sebaiknya tidak hanya berhenti di \"ganti untung\". Perlu dipikirkan lebih lanjut bagaimana nilai tambah dari infrastruktur tersebut yang memberi manfaat bagi rakyat banyak. Pusat-pusat industri baru, misalnya, perlu dibuka lebih banyak di sekitar lokasi infrastruktur.\n" +
                                "\n" +
                                "Selain itu, kebijakan suku bunga di Amerika Serikat sangat mempengaruhi aliran investasi dan nilai tukar. Kita tidak bisa hanya mengandalkan menaikkan suku bunga kita terus-menerus untuk mengimbangi kebijakan negara kuat di bidang ekonomi, yang akan berdampak kurang baik terhadap ketahanan ekonomi. Pemerintah harus segera membenahi current account yang saat ini negatif dengan tidak hanya mengandalkan impor. \n" +
                                "\n" +
                                "Betul bahwa inflasi terjaga dengan baik di kisaran 3% belakangan ini. Tapi jika hanya memperbanyak supply barang dengan melakukan impor sangatlah kurang elok di jangka pendek bagi current account Indonesia yang sekarang defisit ataupun bagi petani kita, maupun di jangka panjang terhadap ketahanan ekonomi Indonesia.\n" +
                                "\n" +
                                "Pertumbuhan dan Stabilitas\n" +
                                "\n" +
                                "Beberapa firma dunia meramalkan Indonesia termasuk negara dengan ekonomi kuat di masa depan. Tetapi hal tersebut hanya dapat terjadi dengan pertumbuhan ekonomi yang cukup tinggi. Pertumbuhan PDB di kisaran 5% tentulah tidak cukup untuk mewujudkan mimpi firma-firma tersebut.\n" +
                                "\n" +
                                "Tantangannya adalah sejauh mana pemerintah memilih antara pertumbuhan dan stabilitas. Belakangan ini sepertinya kebijakan lebih berfokus kepada stabilitas. Pertumbuhan utang pemerintah nampaknya belum cukup radikal berdampak terhadap pertumbuhan ekonomi. Inflasi yang dijaga di angka 3%, cadangan devisa yang terjaga cukup baik, dan suku bunga yang dinaikkan cukup tinggi belakangan ini, memang cukup menjaga stabilitas ekonomi.\n" +
                                "\n" +
                                "Trade-off-nya adalah pertumbuhan ekonomi tidak cukup tinggi jika dibandingkan dengan era commodity boom. Pertumbuhan ekonomi yang ada sekarang tidak cukup baik untuk meningkatkan kualitas hidup masyarakat. Betul angka kemiskinan berkurang. Tetapi penurunan itu berlangsung lebih lambat di masa lalu (kurang dari 1% per tahun dibandingkan lebih dari 1% per tahun di masa commodity boom). Hal tersebut disebabkan pembukaan lapangan kerja dengan kualitas rendah di mana sebagian masyarakat Indonesia bekerja di sektor informal yang tidak cukup aman bagi kehidupannya. \n" +
                                "\n" +
                                "Di masa depan kita harus lebih memfokuskan pada pertumbuhan, yang memerlukan investasi besar-besaran, khususnya di sektor industri yang lebih produktif dalam menumbuhkan ekonomi, tidak hanya di infrastruktur. Hal ini sangat diperlukan untuk menyerap tenaga kerja, di mana Indonesia mendapat bonus demografi. Industri 4.0 justru menjadi tantangan dengan adanya otomatisasi. Digitalisasi yang memperpendek rantai distribusi juga sangat erat kaitannya dengan tenaga kerja yang berada di dalamnya. Jangan sampai bonus demografi malah menjadi kutukan bagi kita dengan adanya kemajuan teknologi.\n" +
                                "\n" +
                                "Fokus pada Rakyat\n" +
                                "\n" +
                                "Perjalanan panjang dalam proses pilpres yang berlangsung hampir setahun terakhir cukup membelah masyarakat. Kita berharap bahwa yang terpilih nantinya dapat berfokus kepada ekonomi rakyat. Daripada hanya berkutat pada isu remeh-temeh mengenai harga telur dan tempe, ataupun seremonial peresmian infrastruktur, adalah lebih baik memikirkan bagaimana menumbuhkan produktivitas ekonomi dan menaikkan pendapatan masyarakat. Kebijakan di bidang energi juga perlu menjadi perhatian, di mana harga komoditas yang naik turunnya sangat cepat dan fluktuatif yang sangat mempengaruhi pemasukan negara.\n" +
                                "\n" +
                                "Jika pasangan petahana yang terpilih, diharapkan dapat memperbaiki banyak hal yang masih kurang baik (kekurangefektivan pembangunan infrastruktur sebagai contoh) dan melanjutkan hal-hal yang sudah baik dengan kecepatan yang lebih baik daripada penantang, dengan melakukan continuous improvement. Jika pasangan penantang yang terpilih, dibutuhkan perencanaan yang sangat matang, dan kebijakan yang terukur dan efektif, serta eksekusi dengan kecepatan tinggi.\n" +
                                "\n" +
                                "Tantangan perang dagang dan kenaikan suku bunga Amerika Serikat maupun tantangan dalam negeri dan global lainnya akan selalu mengiringi perjalanan di masa yang akan datang. Siapapun yang terpilih, baik dengan jargon Indonesia Maju ataupun dengan tagline Indonesia Menang, semoga dapat menjadi katalis ekonomi untuk mewujudkan Indonesia Jaya.\n" +
                                "\n",
                        R.drawable.pilpres1));
        eventNewsList.add(new eventNews(
                1,
                "Dieng Culture Festival (DCF) 2019 ",
                "SEMARANG (Asatu.id) – Dieng Culture Festival (DCF) 2019 yang diselenggarakan oleh Komunitas Dieng Pandawa, akan berlangsung mulai Jumat sampai Minggu (3-5/8). Dieng Pandawa adalah sebuah kelompok sadar wisata (Pokdarwis) di Desa Dieng Kulon, Kecamatan Batur, Banjarnegara.\n" +
                        "Kepala Bidang Pemasaran Dinas Pemuda Olahraga dan Pariwisata (Disporapar) Jawa Tengah, Ida Bagus Ketut Alamsyah, menyatakan, sejumlah agenda sudah disiapkan untuk digelar pada DCF yang tahun ini memasuki penyelenggaraan ke sembilan.\n" +
                        "Agenda itu dimulai pada Jumat (3/8), yaitu Aksi Dieng Bersih, Festival Caping dan Bunga, Pameran Produk UKM dan Kuliner, Festival Jazz Atas Awan, dan Festival Kembang Api.\n" +
                        "Kemudian pada Sabtu (4/8), Gubernur Jawa Tengah Ganjar Pranowo akan membuka acara yang diawali dengan Festival Tumpeng, Kirab Budaya, Sendra Tari Rambut Gembel, Senandung Negeri Atas Awan, serta Festival Lampion.\n" +
                        "Dan pada hari terakhir, Minggu (5/8), akan diadakan Jamasan Rambut Gembel dan Prosesi Ruwatan Cukur Rambut Gembel. Diperkirakan, puncak kunjungan wisatawan akan memenuhi prosesi tersebut.\n" +
                        "“Magnet wisatawan akan mencapai puncaknya pada prosesi ruwatan cukur gembel yang diawali dengan jamasan,” terang Alamsyah.\n" +
                        "Puncak prosesi tersebut akan diselenggarakan di Kompleks Candi Arjuna. Sedangkan seluruh kegiatan akan melibatkan masyarakat Dieng di kawasan Kabupaten Banjarnegara, Wonosobo, dan Batang.\n" +
                        "Untuk para wisatawan yang akan menyaksikan pergelaran DCF dengan memesan tiket online, Alamsyah mewanti-wanti agar berhati-hati dengan promo abal-abal yang biasanya memanfaatkan event ini.\n" +
                        "Pasalnya, sejumlah wisatawan dari Jakarta sempat tertipu dengan biro wisata abal-abal yang turut menjual event DCF 9 ini.\n" +
                        "“Lebih baik langsung menghubungi panitia melalui website resmi di www.diengpandawa.com atau www.dieng.id,” tegasnya.\n",
                R.drawable.dcf1));

        eventNewsList.add(
                new eventNews(
                        2,
                        "Festival Teluk Tomini di Kabupaten Bolaang",
                        "Jakarta, airmagz.com – Festival Teluk Tomini (FTT) 2019 segera digelar di Kabupaten Parigi Moutong, Provinsi Sulawesi Tengah, 19-22 April mendatang. Seperti biasa, acara akan dimeriahkan dengan berbagai kegiatan menarik. Mulai dari Pemilihan Putra Putri Bahari, Fashion Carnival, Lomba Fotografi Objek Wisata, Festival Musik Tradisional, serta Festival Kuliner dan Pameran Kerajinan Rakyat.\n" +
                                "Berangkat dari berbagai kekayaan dan keunikan Sumber Daya alam yang dimiliki Kabupaten Parigi Moutong, maka pada pelaksanaan Festival Teluk Tomini Tahun 2019 kali ini mengangkat Tema : “Parigi Moutong Truly Indonesia” merupakan rangkaian kesatuan kalimat yang memberikan makna, Bahwa Parigi Moutong salah satu Daerah yang berada di Indonesia yang memiliki keindahan alam yang mempesona.\n" +
                                "Selain itu juga, tema ini memiliki spirit yang sama dan sejalan dengan branding Promosi Pariwisata Nusantara yang diusung oleh Kementerian Pariwisata Republik Indonesia yaitu : “PESONA INDONESIA”.\n" +
                                "Dari Tagline Kementerian ini memberikan pesan dan motivasi bagi setiap daerah di Indonesia untuk terus melakukan upaya-upaya promosi berbagai potensi yang menjadi Daya Tarik Pariwisata baik kepada wisatawan nusantara maupun mancanegara.\n" +
                                "Staf Khusus Menteri Bidang Multikultural Kemenpar Esthy Reko Astuti mengatakan, FTT adalah kegiatan rutin tahunan yang masuk Calendar of Event (CoE) Kementerian Pariwisata. Sesuai nama kegiatan, event ini digelar untuk mengeksplor Teluk Tomini agar lebih dikenal masyarakat luas. Dengan festival ini, diharapkan kunjungan wisatawan semakin meningkat, baik wisatawan lokal maupun mancanegara.\n" +
                                "“Teluk Tomini adalah aset berharga bagi sektor pariwisata Indonesia. Di sini, wisatawan bisa melakukan aktivitas snorkeling untuk menikmati keindahan bawah laut. Bagi yang suka memancing, Teluk Tomini juga memiliki spot-spot yang bagus untuk berburu strike,” ujarnya, Jumat (5/4).\n" +
                                "Adapun maksud dan tujuan diadakannya Festival Teluk Tomini antara lain:\n" +
                                "•\tMempromosikan Pariwisata Parigi Moutong melalui Event  Festival Teluk Tomini Tahun 2019\n" +
                                "•\tMembangkitkan iklim kemitraan antara Pemerintah, Stakeholder dan Masyarakat\n" +
                                "•\tMerangsang kunjungan Wisatawan Nusantara dan Wisatawan Mancanegara;\n" +
                                "•\tMenggalangkan rasa memiliki dan persaudaraan dalam Festival Pesona Teluk Tomin.\n" +
                                "•\tMewujudkan ketahanan budaya dan memperkaya khasanah budaya di Sulawesi Tengah\n" +
                                "•\tMenjadikan Parigi Moutong sebagai destinasi wisata nusantara dan mancanegara;\n" +
                                "•\tMenggali minat dan bakat pelaku seni professional iklim dan peluang bisnis bagi UMKM dan Pengusaha\n" +
                                "•\tSebagai ajang promosi daerah untuk program pemerintah yaitu “Pesona Indonesia”\n" +
                                "Seperti event pariwisata lain, Festival Teluk Tomini juga memiliki keistimewaan tersendiri. Biasanya, wisatawan yang datang tak hanya para pelancong lokal, tetapi ada pula turis mancanegara. Dengan kata lain, kegiatan ini juga berpotensi mendulang wisman ke Indonesia.\n" +
                                "Tahun lalu, puncak Festival Teluk Tomini dimeriahkan dengan beragam acara. Antara lain pawai kostum karnaval, parade vespa, parade motor tua, lomba perahu hias, serta pentas musik yang menghadirkan artis lokal. Tahun ini, kegiatan yang dihelat kemungkinan masih sama. Hanya saja, ada hal-hal khusus yang menjadi pembeda, agar jalannya event tak terkesan monoton.\n" +
                                "Festival Teluk Tomini masuk dalam kategori wisata bahari dan budaya. Belakangan, jenis wisata bahari sangat digandrungi karena banyak aktivitas yang bisa dilakukan. Tak hanya bersantai menikmati keindahan pantai, wisatawan juga bisa melakukan kegiatan lain sesuai dengan potensi objek wisata yang bersangkutan. Bisa diving, snorkeling, memancing, bahkan di pantai-pantai tertentu bisa digunakan untuk surfing.\n" +
                                "“Sebagai negara kepulauan, Indonesia memiliki banyak objek wisata pantai yang indah dan potensial. Pantai dan laut menjadi salah satu kekayaan yang bisa digarap untuk menopang sektor pariwisata Indonesia, seiring dengan meningkatnya target kunjungan wisman sebesar 20 juta sepanjang tahun 2019,” jelasnya.\n" +
                                "Menteri Pariwisata Arief Yahya mengatakan, potensi pariwisata bahari Indonesia perlu dikembangkan lebih maksimal. Sebagai negara kepulauan, wisata bahari dinilai mampu memberi pemasukan yang cukup signifikan bagi Indonesia.\n" +
                                "“Kekayaan bahari Indonesia amat beragam. Selain pantai, 70 persen jenis koral yang hidup di dunia terdapat di Indonesia. Sayangnya, kelebihan itu belum dikelola dengan baik, sehingga tidak memberi dampak positif bagi perekonomian negara dan kesejahteraan masyarakat. Perlu terobosan yang lebih efektif untuk mendorong kemajuan wisata bahari kita,” tegasnya. (IMN/Pemkab Parigi Moutong/Merdeka.com)\n",
                        R.drawable.teluktomini3));

        eventNewsList.add(
                new eventNews(
                        3,
                        "Festival Parade 1001 Kuda Sandelwood dan Tenun Ikat 2019 di NTT",
                        "Pulau Sumba yang indah, di Provinsi Nusa Tenggara Timur, akan kembali disorot dengan atraksi spektakuler yang melibatkan lebih dari seribu kuda terbaik di pulau ini ketika Festival Parade 1001 Kuda Sandalwood berlangsung pada tanggal 5 Juli hingga 13 Juli 2019. Menyusul keberhasilan tahun lalu , tradisi yang benar-benar istimewa ini telah berkembang menjadi acara tahunan yang sangat dinanti oleh para wisatawan dari seluruh dunia.\n" +
                                "Selama festival, kuda-kuda akan didekorasi dengan berbagai aksesoris dan dekorasi berkilau yang unik sementara penunggang mengenakan kostum tradisional pulau yang berbeda. Dibagi menjadi kelompok-kelompok, tim kuda dan penunggang kemudian akan bersaing di depan panel juri berdasarkan kriteria yang mencakup keterampilan kecantikan, kinerja, dan manajemen kuda.\n" +
                                "Bagi Anda yang ingin merasakan sensasi menunggang kuda Sandalwood yang terkenal, panitia juga telah menyiapkan kuda untuk wisatawan yang dapat membawa mereka ke banyak tujuan menakjubkan Sumba di seluruh pulau.\n" +
                                "Menambah perayaan, acara akan dikombinasikan dengan Tenun Ikat kain tenun tradisional yang Sumba terkenal, yang akan menampilkan pengrajin tenun terbaik tidak hanya dari Sumba tetapi juga dari pulau lain di provinsi Nusa Tenggara Timur. Festival Tenun Ikat Kain Tenun Tradisional akan diadakan di Tambolaka dan akan menampilkan banyak program menarik termasuk peragaan busana dan pertunjukan tari tradisional Sumba yang luar biasa.\n" +
                                "Penanggung jawab Kalender Acara di Kementerian Pariwisata, Esthy Reko Astuti menyatakan penghargaannya dan berharap bahwa kedua acara tersebut dapat lebih meningkatkan pariwisata pulau ini. \"Saya yakin bahwa kedua acara ini akan semakin memperkuat merek pariwisata Sumba dan Nusa Tenggara Timur khususnya dan Indonesia secara keseluruhan. Ini juga akan menambah daya tarik yang sudah berwarna-warni di Sumba seperti Festival Pasola, Situs Megalitik, dan keunikannya. Budaya Marapu, dan lainnya \"kata Esthy Reko Astuti.\n" +
                                "Menghadap Samudera Hindia yang luas, pulau Sumba yang terletak di dekat Pulau Komodo di provinsi Nusa Tenggara Timur mungkin telah menjadi lebih populer sebagai surga peselancar dan tempat persembunyian terpencil yang eksklusif. Namun, Sumba selama berabad-abad dikenal sebagai Pulau Sandalwood karena kayu harumnya yang dicari terutama oleh bangsawan Cina. Karena alasan ini, kuda Sumba yang gesit disebut Sandalwood Ponies yang paling populer untuk pacuan kuda. Kuda-kuda ini adalah puncak dari tradisi tahunan yang menarik dari Festival Pasola.\n" +
                                "Kuda Sandalwood mendapatkan namanya dari pohon cendana yang dulu tumbuh subur di Sumba dan sudah lama dikaitkan dengan pulau itu. Di Cina, kayu harum ini digunakan untuk membuat peti harta karun berukir indah untuk melestarikan konten berharga mereka dari pembusukan dan serangga.\n" +
                                "Kuda Sandalwood adalah salah satu jenis kuda terbaik di Indonesia, sebagian karena fakta bahwa ini adalah jenis campuran dengan kuda-kuda Arab. Mereka sangat populer di pacuan kuda, baik di flat atau di harness. Mereka juga digunakan dalam pacuan tanpa pelana yang diadakan di pulau-pulau, dengan trek yang sering mencakup lebih dari tiga mil. Secara tradisional, Sandalwood digunakan untuk pekerjaan ringan, pak, pertanian, dan berkuda.\n" +
                                "Untuk mencapai Sumba, Garuda Indonesia memiliki penerbangan reguler ke Tambolaka dari Jakarta dengan singgah di Bali, sementara beberapa maskapai melayani rute Bali-Waingapu.\n" +
                                "\n",
                        R.drawable.kuda2));
        eventNewsList.add(
                new eventNews(
                        4,
                        "NTB Matangkan Persiapan Pesona Khazanah Ramadhan",
                        "REPUBLIKA.CO.ID, MATARAM -- Pemerintah Provinsi Nusa Tenggara Barat (NTB) akan menyelenggarakan ajang Pesona Khazanah Ramadhan (PKR) pada bulan suci Ramadhan tahun ini. Ajang PKR yang memasuki tahun kedua akan menghadirkan dua imam besar asal Mesir, satu imam besar dari Maroko, dan satu imam besar berkebangsaan Yordania.\n" +
                                " \n" +
                                "Panitia PKR Fauzan Zakaria mengataka,n kegiatan ini untuk mengisi aktivitas bulan puasa di Lombok. Pria yang juga menjabat sebagai Ketua Asosiasi Pariwisata Islami Indonesia (APII) mengatakan, keempat imam besar negara Timur Tengah ini akan mengimami shalat tarawih di Masjid Hubbul Wathan, Islamic Center NTB selama Ramadhan berlangsung hingga mengimami shalat idhul fitri.\n" +
                                " \n" +
                                "\"Kami ingin menghadirkan sensasi bulan suci Ramadhan serasa di Mekah Al Mukarromah dengan menghadirkan imam-imam besar dari tiga negara. Secara tidak langsung kami juga mengundang umat Muslim di seluruh nusantara untuk hadir di Lombok selama Ramadhan nanti,\" unar Fauzan saat meninjau venue perhelatan agenda Pesona Khazanah Ramadhan, Sabtu (21/4).\n" +
                                " \n" +
                                "Selain imam besar dari tiga negara itu, Fauzan yang juga lulusan Universitas Al Azhar akan mengundang Ustaz Abdul Somad (UAS) sebagai salah satu penceramah dalam rangkaian kegiatan PKR#2 dan para ulama lainnya. \"Ustadz Abdul Somad kita minta menjadi penceramah pada peringatan Nuzulul Quran dalam kemasan acara Tabligh Akbar,\" lanjut Fauzan.\n" +
                                " \n" +
                                "Fauzan menambahkan, PKR 2018 tahun ini juga akan menghadirkan sejumlah Qori internasional pada bulan turunnya Alquran nanti. \"Kami ingin memberi nuansa berbeda untuk agenda PKR kali ini agar berbeda dengan tahun lalu. Kami ingin menghadirkan lebih banyak tamu dan ulama, agar di bulan Ramadhan nanti, tidak ada istilah low season untuk pariwisata Lombok Sumbawa,\" ucap Fauzan.\n" +
                                " \n" +
                                "Agenda Pesona Khazanah Ramadhan juga akan diramaikan dengan kegiatan tambahan berupa bazaar, pameran buku dan berbagai prodak khas Lombok Sumbawa. Ada juga bazar paket wisata dengan melibatkan pelaku asosiasi yang ada di NTB dan nusantara.\n" +
                                " \n" +
                                "Untuk memberi kesan lebih mendunia, Fauzan mengaku, tengah berupaya melakukan komunikasi dengan sejumlah media besar Timur Tengah untuk datang meliput acara ini. \"Semaksimal mungkin kami akan berusaha agar gaung pesona khazanah ramadhan ini bisa lebih dikenal secara internasional. Dampak yang paling penting adalah Pesona Khazanah Ramadhan mampu memberikan dampak spiritualitas yang menjadi ciri wisata halal Lombok Sumbawa,\" kata dia.\n" +
                                "\n",
                        R.drawable.pkr1));
        eventNewsList.add(
                new eventNews(
                        5,
                        "Pilpres 2019 sebagai Katalis Ekonomi",
                        "Jakarta -\n" +
                                "Pemilihan Umum Presiden 2019 mendekati tahapan akhir. Debat demi debat capres dan cawapres yang sangat menarik telah kita ikuti bersama. Yang lebih penting untuk dinantikan adalah sejauh mana dampak pilpres terhadap ekonomi Indonesia. It's the economy!\n" +
                                "\n" +
                                "The Next Big Thing\n" +
                                "\n" +
                                "Pertumbuhan ekonomi 2018 yang dirilis BPS berada di angka 5.17%, yang lebih baik daripada 2017 (5.07%). Pertumbuhan ekonomi beberapa tahun terakhir berada di sekitar 5% yang bisa dikatakan the new normal. Pesatnya pembangunan belakangan ini, khususnya di bidang infrastruktur, tidak cukup signifikan dalam menaikkan angka pertumbuhan ekonomi atau bisa dikatakan diminishing return ataupun kurang produktif. Utang yang bertambah, walaupun secara angka rasio terhadap GDP masih aman, tidak menyebabkan multiplier effect yang signifikan terhadap ekonomi. Kebijakan reformasi fiskal yang ditandai dengan tax amnesty juga tidak berpengaruh banyak dalam menaikkan rasio pajak terhadap PDB.\n" +
                                "\n" +
                                "Terakhir kali pertumbuhan ekonomi Indonesia di atas 6% disebabkan oleh commodity boom yang sayangnya kurang dimanfaatkan dalam membangun fundamental ekonomi di masa lampau. Oleh karena itu diperlukan strategi baru yang efektif untuk menaikkan tingkat pertumbuhan ekonomi Indonesia, atau bisa jadi diperlukan perubahan yang cukup radikal terhadap ekonomi Indonesia supaya tumbuh lebih tinggi di masa depan. Kita sangat perlu melakukan penguatan komponen-komponen ekonomi dalam negeri supaya Indonesia dapat menjadi the next big thing.\n" +
                                "\n" +
                                "Keunggulan Kompetitif\n" +
                                "\n" +
                                "Jika ditelisik dari komponen PDB, shifting ke sektor industri dan jasa dari sektor pertanian masih belum cukup baik. Hal ini dibuktikan dengan komponen PDB dari sektor pertanian yang masih cukup tinggi (di atas 10%). Perpindahan dari sektor pertanian harus berjalan lebih cepat agar dapat meningkatkan produktivitas masyarakat, tanpa mengurangi kesejahteraan para petani. Di kebanyakan negara maju, ekonomi sangat menitikberatkan kepada sektor industri dan jasa.\n" +
                                "\n" +
                                "Adapun di komponen PDB dari end use, konsumsi rumah tangga masih menjadi andalan, diikuti oleh investasi. Ke depannya perlu dipikirkan kebijakan untuk menumbuhkan investasi supaya dapat menstimulasi konsumsi yang pada akhirnya menumbuhkan ekonomi. \n" +
                                "\n" +
                                "Diperlukan investasi yang cukup besar, khususnya Foreign Direct Investment(yang saat ini masih di kisaran 2% dari PDB) yang berdampak langsung terhadap ekonomi, agar dapat menumbuhkan ekonomi di atas 6% atau lebih tinggi lagi, siapapun presidennya. Kebijakan suku bunga yang tidak terlalu tinggi, keringanan pajak kepada investasi baru, kemudahan izin (ease of doing business, yang saat ini masih di peringkat 70-an), kepastian hukum, pembangunan infrastruktur yang lebih terarah dan efektif, maupun pembukaan pusat-pusat industri baru sangat dibutuhkan untuk menumbuhkan ekonomi lebih tinggi lagi. \n" +
                                "\n" +
                                "Kita perlu menemukan dan memfokuskan keunggulan kompetitif kita dibandingkan negara lain demi kemajuan Indonesia.\n" +
                                "\n" +
                                "Nilai Tambah\n" +
                                "\n" +
                                "Pertumbuhan di masa depan wajib memfokuskan kepada nilai tambah (value added) yang dapat diberikan kepada barang dan jasa. Kita tidak bisa lagi hanya bersandar kepada sumber daya alam mentah yang dijual murah di pasar. Era commodity boom sudah berakhir. Harga komoditas yang fluktuatif dan adanya perang dagang antara Amerika Serikat dan China sangat rentan mempengaruhi Indonesia yang secara ekonomi termasuk dalam weak open economy. \n" +
                                "\n" +
                                "Infrastruktur yang dibangun cukup masif sebaiknya tidak hanya berhenti di \"ganti untung\". Perlu dipikirkan lebih lanjut bagaimana nilai tambah dari infrastruktur tersebut yang memberi manfaat bagi rakyat banyak. Pusat-pusat industri baru, misalnya, perlu dibuka lebih banyak di sekitar lokasi infrastruktur.\n" +
                                "\n" +
                                "Selain itu, kebijakan suku bunga di Amerika Serikat sangat mempengaruhi aliran investasi dan nilai tukar. Kita tidak bisa hanya mengandalkan menaikkan suku bunga kita terus-menerus untuk mengimbangi kebijakan negara kuat di bidang ekonomi, yang akan berdampak kurang baik terhadap ketahanan ekonomi. Pemerintah harus segera membenahi current account yang saat ini negatif dengan tidak hanya mengandalkan impor. \n" +
                                "\n" +
                                "Betul bahwa inflasi terjaga dengan baik di kisaran 3% belakangan ini. Tapi jika hanya memperbanyak supply barang dengan melakukan impor sangatlah kurang elok di jangka pendek bagi current account Indonesia yang sekarang defisit ataupun bagi petani kita, maupun di jangka panjang terhadap ketahanan ekonomi Indonesia.\n" +
                                "\n" +
                                "Pertumbuhan dan Stabilitas\n" +
                                "\n" +
                                "Beberapa firma dunia meramalkan Indonesia termasuk negara dengan ekonomi kuat di masa depan. Tetapi hal tersebut hanya dapat terjadi dengan pertumbuhan ekonomi yang cukup tinggi. Pertumbuhan PDB di kisaran 5% tentulah tidak cukup untuk mewujudkan mimpi firma-firma tersebut.\n" +
                                "\n" +
                                "Tantangannya adalah sejauh mana pemerintah memilih antara pertumbuhan dan stabilitas. Belakangan ini sepertinya kebijakan lebih berfokus kepada stabilitas. Pertumbuhan utang pemerintah nampaknya belum cukup radikal berdampak terhadap pertumbuhan ekonomi. Inflasi yang dijaga di angka 3%, cadangan devisa yang terjaga cukup baik, dan suku bunga yang dinaikkan cukup tinggi belakangan ini, memang cukup menjaga stabilitas ekonomi.\n" +
                                "\n" +
                                "Trade-off-nya adalah pertumbuhan ekonomi tidak cukup tinggi jika dibandingkan dengan era commodity boom. Pertumbuhan ekonomi yang ada sekarang tidak cukup baik untuk meningkatkan kualitas hidup masyarakat. Betul angka kemiskinan berkurang. Tetapi penurunan itu berlangsung lebih lambat di masa lalu (kurang dari 1% per tahun dibandingkan lebih dari 1% per tahun di masa commodity boom). Hal tersebut disebabkan pembukaan lapangan kerja dengan kualitas rendah di mana sebagian masyarakat Indonesia bekerja di sektor informal yang tidak cukup aman bagi kehidupannya. \n" +
                                "\n" +
                                "Di masa depan kita harus lebih memfokuskan pada pertumbuhan, yang memerlukan investasi besar-besaran, khususnya di sektor industri yang lebih produktif dalam menumbuhkan ekonomi, tidak hanya di infrastruktur. Hal ini sangat diperlukan untuk menyerap tenaga kerja, di mana Indonesia mendapat bonus demografi. Industri 4.0 justru menjadi tantangan dengan adanya otomatisasi. Digitalisasi yang memperpendek rantai distribusi juga sangat erat kaitannya dengan tenaga kerja yang berada di dalamnya. Jangan sampai bonus demografi malah menjadi kutukan bagi kita dengan adanya kemajuan teknologi.\n" +
                                "\n" +
                                "Fokus pada Rakyat\n" +
                                "\n" +
                                "Perjalanan panjang dalam proses pilpres yang berlangsung hampir setahun terakhir cukup membelah masyarakat. Kita berharap bahwa yang terpilih nantinya dapat berfokus kepada ekonomi rakyat. Daripada hanya berkutat pada isu remeh-temeh mengenai harga telur dan tempe, ataupun seremonial peresmian infrastruktur, adalah lebih baik memikirkan bagaimana menumbuhkan produktivitas ekonomi dan menaikkan pendapatan masyarakat. Kebijakan di bidang energi juga perlu menjadi perhatian, di mana harga komoditas yang naik turunnya sangat cepat dan fluktuatif yang sangat mempengaruhi pemasukan negara.\n" +
                                "\n" +
                                "Jika pasangan petahana yang terpilih, diharapkan dapat memperbaiki banyak hal yang masih kurang baik (kekurangefektivan pembangunan infrastruktur sebagai contoh) dan melanjutkan hal-hal yang sudah baik dengan kecepatan yang lebih baik daripada penantang, dengan melakukan continuous improvement. Jika pasangan penantang yang terpilih, dibutuhkan perencanaan yang sangat matang, dan kebijakan yang terukur dan efektif, serta eksekusi dengan kecepatan tinggi.\n" +
                                "\n" +
                                "Tantangan perang dagang dan kenaikan suku bunga Amerika Serikat maupun tantangan dalam negeri dan global lainnya akan selalu mengiringi perjalanan di masa yang akan datang. Siapapun yang terpilih, baik dengan jargon Indonesia Maju ataupun dengan tagline Indonesia Menang, semoga dapat menjadi katalis ekonomi untuk mewujudkan Indonesia Jaya.\n" +
                                "\n",
                        R.drawable.pilpres1));

        adapter = new eventNewsAdapter(getContext(),eventNewsList);
        recyclerView.setAdapter(adapter);
        return view;

    }

}
