
package logitechMetodos;

import com.logitech.gaming.LogiLED;

public class logitechMetodosAuxiliares {   
   private static int [][]botoes={{0xFFFF1,0x01,0x3b,0x3c,0x3d,0x3e,0x3f,0x40,0x41,0x42,0x43,0x44,0x57,0x58,0x137,0x46,0x145},
       {0xFFF1,0x29,0x02,0x03,0x04,0x05,0x06,0x07,0x08,0x09,0x0A,0x0B,0x0C,0x0D,0x0E,0x152,0x147,0x149,0x45,0x135,0x37,0x4A},
       {0xFFF2,0x0F,0x10,0x11,0x12,0x13,0x14,0x15,0x16,0x17,0x18,0x19,0x1A,0x1B,0x2B,0x153,0x14F,0x151,0x47,0x48,0x49,0x4E},
       {0xFFF3,0x3A,0x1E,0x1F,0x20,0x21,0x22,0x23,0x24,0x25,0x26,0x27,0x28,0x1C,0x4B,0x4C,0x4D},
       {0xFFF4,0x2A,0x2C,0x2D,0x2E,0x2F,0x30,0x31,0x32,0x33,0x34,0x35,0x36,0x148,0x4F,0x50,0x51,0x11C},
       {0xFFF5,0x1D,0x15B,0x38,0x39,0x138,0x15C,0x15D,0x11D,0x14B,0x150,0x14D,0x52,0x53}       
   };
   private int r;
   private int g;
   private int b;
   public logitechMetodosAuxiliares(){        
    }
   public int [][] getBotoes(){
       return botoes;
   }
   
   public void setRGB(int r,int g,int b){
       this.r=(r*100)/255;
       this.g=(g*100)/255;
       this.b=(b*100)/255;     
   }
   
   public int getR(){
       return this.r;
   }
   public int getG(){
       return this.g;
   }
   public int getB(){
       return this.b;
   }
   
   
    public void porTecla(int tecla) throws Exception{        
          LogiLED.LogiLedSetLightingForKeyWithScanCode(tecla,r,g,b);
    }
   
    public void setCorMousemat(){
        try{
        LogiLED.LogiLedSetLightingForTargetZone(4, 0, r, g, b);
        }catch(Exception ex){                  
        }
    }
    
    public void setCorMouse(){
        try{
          LogiLED.LogiLedSetLightingForTargetZone(3, 0, r, g, b);
          }catch(Exception ex){
            
        }
        try{
          LogiLED.LogiLedSetLightingForTargetZone(3, 1, r, g, b);
          }catch(Exception ex){
            
        }
    }
    public void setCorHeadSet(){
        try{
        LogiLED.LogiLedSetLightingForTargetZone(8, 1, r, g, b);
        }catch(Exception ex){
            
        }
        try{
        LogiLED.LogiLedSetLightingForTargetZone(8, 0, r, g, b);
        }catch(Exception ex){            
        }
    }
    
    public void setAllLight(){
         LogiLED.LogiLedSetLighting(r, g, b);
    }
}