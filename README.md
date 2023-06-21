# Mini Blockchain
This project is one I took up during school. We had recently learned some of the core features to blockchain technology and were challenged to create our own.

I took advantage of Java Servlets to connect P2P and compete amongst other devices. Winners are awarded "crypto" to which they can purchase or exchange images with other devices on a local HTTP interface. These transactions were then recorded and hashed into the next block.

One of the most challenging features was ensuring my blockchain could accept any amount of transactions, while also creating an appropriate merkle root tree. I managed to successfully accomplish this with the help of logarithmic fuctions, this work can be seen in "Block.Java"
