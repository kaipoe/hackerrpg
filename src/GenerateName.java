package src;

public class GenerateName {

    public String generateName() {
        String[] nounList = new String[] {"malware", "trojan", "virus", "computer", "arbiter", "intruder", "defender", "machine", "user",
                "program", "code", "robot", "cyborg", "backdoor", "sniffer", "exploit", "bug", "worm", "packet", "payload"};;
        String[] adjList = new String[] {"c1unky", "wir3d", "cybern3tic", "el3ctric", "conn3cted", "inf1ltrating", "buggy",
                "root3d", "sn3aky", "spr3ading", "cl0ned", "artif1cial", "senti3nt", "kill3r", "ex3cuted", "forg0tten", "leg4cy", "zer0day",
                "inj3cted", "mal1cious"};

        String username = adjList[(int)Math.floor(Math.random() * 20)] + nounList[(int)Math.floor(Math.random() * 20)];

        return username;
    }
}
