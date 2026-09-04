public class Chanson {
    private int duree;
    private String artiste;
    private String album;
    private String nomChanson;
    //Dédicace David

    public void jouer(){
        System.out.println("Ma chanson est en cours de lecture. C'est " + nomChanson + " chantée par " +  artiste);
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getArtiste() {
        return artiste;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getNomChanson() {
        return nomChanson;
    }

    public void setNomChanson(String nomChanson) {
        this.nomChanson = nomChanson;
    }
}
