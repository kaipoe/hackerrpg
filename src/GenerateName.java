package src;

public class GenerateName {

    public String generateName() {
        String[] nounList = new String[20];
        String[] adjList = new String[20];
        nounList = new String[] {"malwar3", "tr0jan", "v1rus", "comput3r", "arbit3r", "intrud3r", "def3nder", "soldi3r", "us3r",
        "pr0gram", "cod3", "r0bot", "cyb0rg", "b4ckdoor", "sn1ffer", "expl0it", "bug", "w0rm", "pack3t", "payl0ad"};
        adjList = new String[] {"c1unky", "wir3d", "cybern3tic", "el3ctric", "conn3cted", "inf1ltrating", "buggy",
        "root3d", "sn3aky", "spr3ading", "cl0ned", "artif1cial", "senti3nt", "kill3r", "ex3cuted", "forg0tten", "leg4cy", "zer0day",
        "inj3cted", "mal1cious"};
        String username = adjList[(int)Math.random() * 20] + nounList[(int)Math.random() * 20];

        return username;
    }
}
