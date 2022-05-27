package com.company;
import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Round {
    private boolean over;
    private boolean under;
  private int p1Score;
  private int p2Score;
  private int p3Score;
  private int p4Score;

  private boolean p1Win;
  private boolean p2Win;
  private boolean p3win;
  private boolean p4Win;

  private boolean p1Call;
  private boolean p2Call;
  private boolean p3Call;
  private boolean p4Call;

  private boolean p1Risk;
  private boolean p2Risk;
  private boolean p3Risk;
  private boolean p4Risk;
//Double Risk
  private boolean p1DRisk;
  private boolean p2DRisk;
  private boolean p3DRisk;
  private boolean p4DRisk;
  //Triple Risk
  private boolean p1TRisk;
  private boolean p2TRisk;
  private boolean p3TRisk;
  private boolean p4TRisk;

  private boolean p1With;
  private boolean p2With;
  private boolean p3With;
  private boolean p4With;
//Player gab kam lamma
  private int p1Lamaat;
  private int p2Lamaat;
  private int p3Lamaat;
  private int p4Lamaat;

  private int p1talebKam;
  private int p2talebKam;
  private int p3talebKam;
  private int p4talebKam;

  private int p1far2;
  private int p2far2;
  private int p3far2;
  private int p4far2;


    public int getP1Lamaat() {
        return p1Lamaat;
    }

    public void setP1Lamaat(int p1Lamaat) {
        this.p1Lamaat = p1Lamaat;
    }

    public int getP2Lamaat() {
        return p2Lamaat;
    }

    public void setP2Lamaat(int p2Lamaat) {
        this.p2Lamaat = p2Lamaat;
    }

    public int getP3Lamaat() {
        return p3Lamaat;
    }

    public void setP3Lamaat(int p3Lamaat) {
        this.p3Lamaat = p3Lamaat;
    }

    public int getP4Lamaat() {
        return p4Lamaat;
    }

    public void setP4Lamaat(int p4Lamaat) {
        this.p4Lamaat = p4Lamaat;
    }

    public int getP1talebKam() {
        return p1talebKam;
    }

    public void setP1talebKam(int p1talebKam) {
        this.p1talebKam = p1talebKam;
    }

    public int getP2talebKam() {
        return p2talebKam;
    }

    public void setP2talebKam(int p2talebKam) {
        this.p2talebKam = p2talebKam;
    }

    public int getP3talebKam() {
        return p3talebKam;
    }

    public void setP3talebKam(int p3talebKam) {
        this.p3talebKam = p3talebKam;
    }

    public int getP4talebKam() {
        return p4talebKam;
    }

    public void setP4talebKam(int p4talebKam) {
        this.p4talebKam = p4talebKam;
    }

    public int getP1far2() {
        return p1far2;
    }

    public void setP1far2() {
        this.p1far2 = abs(this.p1talebKam - this.p1Lamaat);

    }

    public int getP2far2() {
        return p2far2;
    }

    public void setP2far2() {
        this.p2far2 = abs(this.p2talebKam - this.p2Lamaat);
    }

    public int getP3far2() {
        return p3far2;
    }

    public void setP3far2() {
        this.p3far2 = abs(this.p3talebKam - this.p3Lamaat);
    }

    public int getP4far2() {
        return p4far2;
    }

    public void setP4far2() {
        this.p4far2 = abs(this.p4talebKam - this.p4Lamaat);

    }

    public void setCall(Player p){
        if(p.getId()==1){
            this.p1Call = true;
        } else if (p.getId()==2){
            this.p2Call = true;
        } else if(p.getId()==3){
            this.p3Call = true;
        }
        else if(p.getId()==4){
            this.p4Call = true;
        }
    }
    public void setWith(Player p){
        if(p.getId()==1){
            this.p1With = true;
        } else if (p.getId()==2){
            this.p2With = true;
        } else if(p.getId()==3){
            this.p3With = true;
        }
        else if(p.getId()==4){
            this.p4With = true;
        }
    }
    public void setRisk(Player p){
        if(p.getId()==1){
            this.p1Risk = true;
        } else if (p.getId()==2){
            this.p2Risk = true;
        } else if(p.getId()==3){
            this.p3Risk = true;
        }
        else if(p.getId()==4){
            this.p4Risk = true;
        }
    }
    public void setDoubleRisk(Player p){
        if(p.getId()==1){
            this.p1DRisk = true;
        } else if (p.getId()==2){
            this.p2DRisk = true;
        } else if(p.getId()==3){
            this.p3DRisk = true;
        }
        else if(p.getId()==4){
            this.p4DRisk = true;
        }
    }
    public void setTripleRisk(Player p){
        if(p.getId()==1){
            this.p1TRisk = true;
        } else if (p.getId()==2){
            this.p2TRisk = true;
        } else if(p.getId()==3){
            this.p3TRisk = true;
        }
        else if(p.getId()==4){
            this.p4TRisk = true;
        }
    }

    public void roundDidBegin(int p1talab, int p2talab, int p3talab, int p4talab){
        if(p1talab+p2talab+p3talab+p4talab==13) {
            System.out.println("Problem with 3adad el lamaat");
        }
        else if(p1talab+p2talab+p3talab+p4talab>13) {
            this.over = true;
            setP1talebKam(p1talab);
            setP2talebKam(p2talab);
            setP3talebKam(p3talab);
            setP4talebKam(p4talab);
        }
        else{
            this.under = true;
            setP1talebKam(p1talab);
            setP2talebKam(p2talab);
            setP3talebKam(p3talab);
            setP4talebKam(p4talab);
        }
    }
    public void roundDidEnd(int p1lamat, int p2lamat, int p3lamat, int p4lamat){
        setP1Lamaat(p1lamat);
        setP2Lamaat(p2lamat);
        setP3Lamaat(p3lamat);
        setP4Lamaat(p4lamat);
        setP1far2();
        setP2far2();
        setP3far2();
        setP4far2();
        if(getP1far2()==0){
            this.p1Win = true;
        }else {this.p1Win = false;}
        if(getP2far2()==0){
            this.p2Win = true;
        }else {this.p2Win = false;}
        if(getP3far2()==0){
            this.p3win = true;
        }else {this.p3win = false;}
        if(getP4far2()==0){
            this.p4Win = true;
        }else {this.p4Win = false;}

    }
    public void Lose(){
        if(p1Win == false){
                if (p1Win == false && p2Win == true && p3win == true && p4Win == true) {
                    this.p1Score = this.p1Score - 10;
                } else {
                    this.p1Score = -1 * p1far2;
                }
                if (p1Call == true) {
                    //Super Call
                    if(getP1talebKam()>=8){
                        //this.p1Score = pow(getP1Lamaat(),2);
                        this.p1Score = getP1talebKam() * getP1talebKam() / 2 * -1 ;
                    }
                    //Dash Call
                    else if(getP1talebKam() == 0){
                        if(over == true){
                            this.p1Score = this.p1Score - 23;
                        }else if (under == true){
                            this.p1Score = this.p1Score - 33;
                        }
                    }
                    //call 3ady
                    else {this.p1Score = this.p1Score - 10;}
                }
                if (p1Risk == true) {
                    this.p1Score = this.p1Score - 10;
                }
                if (p1DRisk == true) {
                    this.p1Score = this.p1Score - 20;
                }
                if (p1TRisk == true) {
                    this.p1Score = this.p1Score - 30;
                }
                if (p1With == true) {
                    this.p1Score = this.p1Score - 10;
                }

        }
        if(p2Win == false){
                if (p1Win == true && p2Win == false && p3win == false && p4Win == false) {
                    this.p2Score = this.p2Score - 10;
                } else {
                    this.p2Score = -1 * p1far2;
                }
                if (p2Call == true) {
                    //Super Call
                    if(getP2talebKam()>=8){
                        //this.p1Score = pow(getP1Lamaat(),2);
                        this.p2Score = getP2talebKam() * getP2talebKam() / 2 * -1 ;
                    }
                    //Dash Call
                    else if(getP2talebKam() == 0){
                        if(over == true){
                            this.p2Score = this.p2Score - 23;
                        }else if (under == true){
                            this.p2Score = this.p2Score - 33;
                        }
                    }
                    //call 3ady
                    else {this.p2Score = this.p2Score - 10;}
                }
                if (p2Risk == true) {
                    this.p2Score = this.p2Score - 10;
                }
                if (p2DRisk == true) {
                    this.p2Score = this.p2Score - 20;
                }
                if (p2TRisk == true) {
                    this.p2Score = this.p2Score - 30;
                }
                if (p2With == true) {
                    this.p2Score = this.p2Score - 10;
                }
        }
        if(p3win == false){
                if (p1Win == false && p2Win == false && p3win == true && p4Win == false) {
                    this.p3Score = this.p3Score - 10;
                } else {
                    this.p3Score = -1 * p3far2;
                }
                if (p3Call == true) {
                    //Super Call
                    if(getP3talebKam()>=8){
                        //this.p1Score = pow(getP1Lamaat(),2);
                        this.p3Score = getP3talebKam() * getP3talebKam() / 2 * -1 ;
                    }
                    //Dash Call
                    else if(getP3talebKam() == 0){
                        if(over == true){
                            this.p3Score = this.p3Score - 23;
                        }else if (under == true){
                            this.p3Score = this.p3Score - 33;
                        }
                    }
                    //call 3ady
                    else {this.p3Score = this.p3Score - 10;}
                }
                if (p3Risk == true) {
                    this.p3Score = this.p3Score - 10;
                }
                if (p3DRisk == true) {
                    this.p3Score = this.p3Score - 20;
                }
                if (p3TRisk == true) {
                    this.p3Score = this.p3Score - 30;
                }
                if (p3With == true) {
                    this.p3Score = p3Score - 10;
                }
        }
        if(p4Win == false){
                if (p1Win == false && p2Win == false && p3win == false && p4Win == true) {
                    this.p4Score = this.p4Score - 10;
                } else {
                    this.p4Score = -1 * p4far2;
                }
                if (p4Call == true) {

                    //Super Call
                    if(getP4talebKam()>=8){
                        //this.p1Score = pow(getP1Lamaat(),2);
                        this.p4Score = getP4talebKam() * getP4talebKam() / 2 * -1 ;
                    }
                    //Dash Call
                    else if(getP4talebKam() == 0){
                        if(over == true){
                            this.p4Score = this.p4Score -23;
                        }else if (under == true){
                            this.p1Score = this.p4Score -33;
                        }
                    }
                    //call 3ady
                    else {this.p4Score = this.p4Score - 10;}
                }
                if (p4Risk == true) {
                    this.p4Score = this.p4Score - 10;
                }
                if (p4DRisk == true) {
                    this.p4Score = this.p4Score - 20;
                }
                if (p4TRisk == true) {
                    this.p4Score = this.p4Score - 30;
                }
                if (p4With == true) {
                    this.p4Score = this.p4Score - 10;
                }
        }
    }
    public void Win(){
        if(p1Win == true){
                if (p1Win == true && p2Win == false && p3win == false && p4Win == false) {
                    this.p1Score = this.p1Score + 10;
                }
                if (p1Call == true) {
                    //Super Call
                    if(getP1Lamaat()>=8){
                        //this.p1Score = pow(getP1Lamaat(),2);
                        this.p1Score = getP1Lamaat() * getP1Lamaat() ;
                    }
                    //Dash Call
                    else if(getP1talebKam() == 0){
                        if(over == true){
                            this.p1Score = this.p1Score + 23;
                        }else if (under == true){
                            this.p1Score = this.p1Score + 33;
                        }
                    }
                    // call 3ady
                   else {this.p1Score = this.p1Score + 10;}
                }
                if (p1Risk == true) {
                    this.p1Score = this.p1Score + 10;
                }
                if (p1DRisk == true) {
                    this.p1Score = this.p1Score + 20;
                }
                if (p1TRisk == true) {
                    this.p1Score = this.p1Score + 30;
                }
                if (p1With == true) {
                    this.p1Score = this.p1Score + 10;
                }

        }
        if(p2Win == true){

                if (p1Win == false && p2Win == true && p3win == false && p4Win == false) {
                    //only winner
                    this.p2Score = this.p2Score + 10;
                }
                if (p2Call == true) {
                    //Super Call
                    if(getP2Lamaat()>=8){
                        //this.p2Score = pow(getP1Lamaat(),2);
                        this.p2Score = getP2Lamaat() * getP2Lamaat() ;
                    }
                    //Dash Call
                    else if(getP2talebKam() == 0){
                        if(over == true){
                            this.p2Score = this.p2Score + 23;
                        }else if (under == true){
                            this.p2Score = this.p2Score + 33;
                        }
                    }
                    // call 3ady
                    else {this.p2Score = this.p2Score + 10;}
                }
                if (p2Risk == true) {
                    this.p2Score = this.p2Score + 10;
                }
                if (p2DRisk == true) {
                    this.p2Score = this.p2Score + 20;
                }
                if (p2TRisk == true) {
                    this.p2Score = this.p2Score + 30;
                }
                if (p2With == true) {
                    this.p2Score = this.p2Score + 10;
                }

        }
        if(p3win == true){
                if (p1Win == false && p2Win == false && p3win == true && p4Win == false) {
                    this.p3Score = this.p3Score + 10;
                }
                if (p3Call == true) {
                    //Super Call
                    if(getP3Lamaat()>=8){
                        this.p3Score = getP3Lamaat() * getP3Lamaat() ;
                    }
                    //Dash Call
                    else if(getP3talebKam() == 0){
                        if(over == true){
                            this.p3Score = this.p3Score + 23;
                        }else if (under == true){
                            this.p3Score = this.p3Score + 33;
                        }
                    }
                    // call 3ady
                    else {this.p3Score = this.p3Score + 10;}
                }
                if (p3Risk == true) {
                    this.p3Score = this.p3Score + 10;
                }
                if (p3DRisk == true) {
                    this.p3Score = this.p3Score + 20;
                }
                if (p3TRisk == true) {
                    this.p3Score = this.p3Score + 30;
                }
                if (p3With == true) {
                    this.p3Score = this.p3Score + 10;
                }

        }
        if(p4Win == true){
                if (p1Win == false && p2Win == false && p3win == false && p4Win == true) {
                    this.p4Score = p4Score + 10;
                }
                if (p4Call == true) {
                    //Super Call
                    if(getP4Lamaat()>=8){
                        //this.p1Score = pow(getP1Lamaat(),2);
                        this.p4Score = getP4Lamaat() * getP4Lamaat() ;
                    }
                    //Dash Call
                    else if(getP4talebKam() == 0){
                        if(over == true){
                            this.p4Score = this.p4Score + 23;
                        }else if (under == true){
                            this.p4Score = this.p4Score + 33;
                        }
                    }
                    // call 3ady
                    else {this.p4Score = this.p4Score + 10;}
                }
                if (p4Risk == true) {
                    this.p4Score = this.p4Score + 10;
                }
                if (p4DRisk == true) {
                    this.p4Score = this.p4Score + 20;
                }
                if (p4TRisk == true) {
                    this.p4Score = this.p4Score + 30;
                }
                if (p4With == true) {
                    this.p4Score = p4Score + 10;
                }

        }
    }
}
