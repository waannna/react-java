package  latihan.per3;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class User {

    public static void main(String[] args) {
        // Inisialisasi ArrayList
        // ArrayList<String> list = new ArrayList<>();

        // // Menambahkan data ke dalam ArrayList
        // list.add("Ade");
        // list.add("Ahmad");
        // list.add("Ali");
        // list.add("Fadlan");
        // // Menampilkan data sebelum dilakukan manipulasi indeks
        // System.out.println("Before update");
        // System.out.println(list);
        // // Melakukan update data pada indeks ke-1 menggunakan method set()
        // list.set(1, "Shani");
        // // Menampilkan data setelah dilakukan update
        // System.out.println("After remove");
        // System.out.println(list);
        HashMap<String, String> days = new HashMap<String, String>();

        days.put("senin", "Menghapal vocab");
        days.put("selasa", "Hapalan vocab");
        days.put("rabu", "Ada tes vocab");
        days.put("kamis", "Pengumuman nilai vocab");
        days.put("jumat", "Kecewa dengan pengumuman vocab");
        days.put("sabtu", "Dikasih vocab baru");
        days.put("minggu", "Aku suka vocab :)");

        for (Map.Entry<String, String> x : days.import { ArrowUpRight } from 'lucide-react';
import profileImg from '../assets/profile.jpg';

export default function Hero() {
  return (
    <section className="bg-[#fbf9f5] text-black font-serif px-4 md:px-12 py-10 border-b-2 border-black">
      <div className="max-w-6xl mx-auto">

        {/* Main Headline */}
        <div className="border-b-2 border-black pb-4 mb-6">
          <span className="bg-black text-white px-2 py-0.5 text-xs font-mono font-bold uppercase tracking-wider">
            BERITA UTAMA
          </span>
          <h1 className="text-3xl sm:text-5xl md:text-6xl font-black tracking-tight leading-none mt-3 uppercase">
            Building Interfaces People Actually Enjoy Using
          </h1>
        </div>

        {/* Content Layout 2 Kolom ala Koran */}
        <div className="grid grid-cols-1 lg:grid-cols-12 gap-8 items-stretch">

          {/* Kolom Kiri: Teks Pengantar */}
          <div className="lg:col-span-7 flex flex-col justify-between font-serif text-sm sm:text-base leading-relaxed text-zinc-900">
            <div className="space-y-4">
              <p className="first-letter:text-5xl first-letter:font-black first-letter:float-left first-letter:mr-3 first-letter:leading-none">
                I'm Ade Dermawan, studying Informatics Management (D3) at Pasim National University, Bandung. I picked up web development through the PUB scholarship, and ended up leaning toward frontend — I like taking a design and figuring out how to make it feel right to actually use.
              </p>
              <p className="border-l-2 border-black pl-4 italic text-zinc-800">
                Frontend's my favorite because you see the payoff immediately — when a layout clicks and the interactions feel smooth, that's a good feeling. Backend's important, but UI is where I actually get to play around and be creative.
              </p>
              <p className="text-xs font-mono text-zinc-600">
                * Outside of web dev, I also mess around with digital content and local server setups just for fun.
              </p>
            </div>

            {/* Action Callout Box */}
            <div className="mt-8 p-4 border border-black bg-[#f0ece1] font-mono text-xs flex flex-wrap items-center justify-between gap-4">
              <div>
                <span className="font-bold block">CURRENT STATUS:</span>
                <span>Open to project collaborations and freelance work.</span>
              </div>
              
                href="#projects"
                className="bg-black text-white hover:bg-zinc-800 px-4 py-2 font-bold flex items-center gap-1 uppercase transition-colors"
              >
                View My Work <ArrowUpRight className="w-3.5 h-3.5" />
              </a>
            </div>
          </div>

          {/* Kolom Kanan: Foto Profil Berukuran Proporsional */}
          <div className="lg:col-span-5 flex flex-col items-center justify-start">
            <div className="border-2 border-black p-2 bg-white w-full max-w-md">
              <div className="overflow-hidden border border-black max-h-[380px]">
                <img
                  src={profileImg}
                  alt="Ade Dermawan"
                  className="w-full h-[380px] object-cover object-center grayscale contrast-125"
                />
              </div>
              <div className="mt-2 text-center font-mono text-[11px] text-zinc-700 uppercase tracking-tighter">
                Fig. 1.0 — Ade, taking a break from the screen.
              </div>
            </div>
          </div>

        </div>

      </div>
    </section>
  );
}entrySet()) {
            System.out.println(x.getKey() + " : " + x.getValue());
        }

    }
}
