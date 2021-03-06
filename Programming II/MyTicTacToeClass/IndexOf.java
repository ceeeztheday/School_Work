p u b l i c   c l a s s   I n d e x O f 
 { 
       p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g   [ ]   a r g s ) 
       { 
             / / S T R I N G   S E A R C H I N G :     
             / /   D e m o n s t r a t e s   s e a r c h i n g   a   c h a r a c t e r   i n   a   s t r i n g 
             S t r i n g   s t r   =   " O C P J P " ; 
             S y s t e m . o u t . p r i n t l n ( " C h a r a c t e r   J   o c c u r s   a t   i n d e x :   "   +   s t r . i n d e x O f ( ' J ' ) ) ; 
             / / o u t p u t :   C h a r a c t e r   J   o c c u r s   a t   i n d e x :   3 
             
             
             / / i n d e x O f ( " f o r "   ) 
             / /   D e m o n s t r a t e s   s e a r c h i n g   a   s u b s t r i n g   w i t h i n   a   s t r i n g   u s i n g   i n d e x O f ( )   m e t h o d 
             s t r   =   " I   a m   p r e p a r i n g   f o r   O C P J P " ; 
             S y s t e m . o u t . p r i n t l n ( " S u b s t r i n g   \ " f o r \ "   o c c u r s   a t   i n d e x :   "   +   s t r . i n d e x O f ( " f o r " ) ) ; 
             / / o u t p u t :   S u b s t r i n g   " f o r "   o c c u r s   a t   i n d e x :   1 5 
             
             
             / / i n d e x O f ( " f o r t " ) 
             / /   D e m o n s t r a t e s   s e a r c h i n g   a   s u b s t r i n g   w i t h i n   a   s t r i n g   u s i n g   i n d e x O f ( )   m e t h o d 
             / /         w h e r e   v a l u e   i s   n o t   p r e s e n t 
             s t r   =   " I   a m   p r e p a r i n g   f o r   O C P J P " ; 
             S y s t e m . o u t . p r i n t l n ( " S u b s t r i n g   \ " f o r t \ "   o c c u r s   a t   i n d e x :   "   +   s t r . i n d e x O f ( " f o r t " ) ) ; 
             / / o u t p u t :   S u b s t r i n g   " f o r t "   o c c u r s   a t   i n d e x :   - 1 
             
             / /   S e a r c h   m u l t i p l e   o c c u r e n c e s   o f   a   s e a r c h   s t r i n g 
             s t r   =   " I   a m   a   s t u d e n t .   I   a m   p r e p a r i n g   f o r   O C P J P " ; 
             i n t   f r o m I n d e x   =   0 ; 
             w h i l e ( s t r . i n d e x O f ( " a m " ,   f r o m I n d e x )   >   - 1 )   
             { 
                   f r o m I n d e x   =   s t r . i n d e x O f ( " a m " ,   f r o m I n d e x ) ; 
                   S y s t e m . o u t . p r i n t l n ( " S u b s t r i n g   \ " a m \ "   o c c u r s   a t   i n d e x :   "   +   f r o m I n d e x ) ; 
                   f r o m I n d e x + + ; 
             } 
             / / o u t p u t :   S u b s t r i n g   " a m "   o c c u r s   a t   i n d e x :   2 
       / /                 S u b s t r i n g   " a m "   o c c u r s   a t   i n d e x :   1 8 
       } 
 
 } 