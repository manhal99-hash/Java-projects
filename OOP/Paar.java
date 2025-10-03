package Uebung2;

import Uebung1.Person;

public class Paar<E,Z>{
    private E erstes;
    private Z zweites;

    public Paar(E erstes, Z zweites){
        this.erstes = erstes;
        this.zweites = zweites;
    }
    public E getErstes(){
        return erstes;
    }
    public Z getZweites(){
        return zweites;
    }
    public void setErstes(E neuErstes){
        this.erstes = neuErstes;
    }
    public void setZweites(Z neuZweites){
        this.zweites = neuZweites;
    }

  @Override
  public boolean equals(Object obj){
        if(this == obj)return true;
        if(obj == null || getClass() != obj.getClass())return false;

        @SuppressWarnings("Unchecked")
        Paar<E,Z> other = (Paar<E, Z>) obj;

        if(erstes == null){
            if(other.erstes != null)return false;
        } else{
            if(!erstes.equals(other.erstes))return false;
        }

        if(zweites == null){
            if(other.zweites != null)return false;
        } else{
            if(!zweites.equals(other.zweites))return false;
        }

        return true;
  }
    @Override
    public String toString(){
        return "(" + this.erstes + this.zweites+")";
    }

}
