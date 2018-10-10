# Rastgele Proje İsim Üreteci

Bir projede ilk adım proje için anlamlı bir kod adı belirlemektir.  Proje kod adlarının mutlaka 
proje içeriğini yansıtması gerekmez.  İsmin kolayca hatırlanabilir olması ve bir parça özgün 
olması önemlidir.  Örneğin Mac OS X işletim sistemi sürümleri bu şekilde isimlendirilmiştir: 
“Snow Leopard”, “Mountain Lion”, “Maverick”, “Yosemite” gibi.  Bu projede bir rasgele isim 
(kod adı) üretecini seçtiğiniz bir dilde yazacaksınız.  Program aşağıdaki özelliklere sahip 
olacaktır: 
● Rasgele isim üretimi özelliği öncelikle bir kitaplık (seçtiğiniz dilde bir modül veya sınıf 
olarak) halinde kodlanacak ve bu kitaplığı kullanan bir komut satırı programı 
yazacaksınız.  (Bu sayede gelecekte aynı işlevi komut satırı yerine farklı bir ön yüz, 
örneğin bir web servisi veya GUI programı olarak da gerçekleyebilirsiniz.) 
● Program İngilizce ve Türkçe olarak iki farklı sözlüğe sahip olacak ve hangi dilde isim 
üretileceği komut satırı seçenekleriyle belirtilebilecektir. 
● Her sözlükte “sıfat” ve “isim” olarak iki kelime grubu olacaktır.  Örneğin Türkçe için: 
 
Sıfatlar: iri, güzel, acaip, fantastik, berbat, iğrenç, yayvan, engebeli 
İsimler: aysberg, bisiklet, deniz, bayram, parti, sabah, uyku 
 
Bu şekilde “sıfat­isim” biçiminde rasgele isimler üreteceksiniz.  Örneğin: 
“acaip­sabah”, “engebeli­uyku”. 
● Üretilen isimlerin daha önceden üretilmemiş olması gerekmektedir.  Üretilen tüm 
isimlerin bir proje kök dizininde alt dizin olarak oluşturulduğunu kabul edelim.  Program 
proje kök dizinine bakarak üretilen isimde bir dizinin olup olmadığına bakacak ve o 
isimde bir dizin olduğu sürece yeni bir rasgele isim üretecektir. 
● Program tek seferde çok sayıda rasgele isim üretebilmelidir.  Örneğin çalıştırıldığında 
10 adet tekil rasgele isim üretebilmelidir.  Üretilecek isim sayısı da komut satırı 
seçenekleriyle belirtilebilecektir. 
 
Alt Tireden Boşluğa Dizgi Dönüşümü 
Bir dizgideki kelime arası alt tire (underscore) karakterlerini boşlukla değiştiren aşağıda 
özelliklerde bir kod yazın. 
● Örnek girdi ve çıktılar: 
 
“foo_bar” → ”foo bar” 
“_foo_bar” → ”_foo bar” 
“foo_bar_” → ”foo bar_” 
“_” → ”_” 
 
Görüldüğü gibi sadece kelime arasındaki alt tireleri boşlukla değiştiriyoruz 
● ReplaceUnderscoreWithSpace  adında bir fonksiyon veya metod adı kullanın. 
● Bu fonksiyonu seçtiğiniz dilde sınıf yamalama özelliği varsa String sınıfına eklemeye 
çalışın.  Örneğin fonksiyonu: ReplaceUnderscoreWithSpace(“foo_bar”) 
şeklinde kullanmak yerine “foo_bar”.ReplaceUnderscoreWithSpace() 
olarak kullanmayı istiyoruz. 
