p u b l i c   c l a s s   S t r i n g s M e t h o d  
 {  
       p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g   [ ]   a r g s )  
       {  
             S t r i n g   s t r   =   " a b c " ;  
             S t r i n g   s t r 2   =   " c d e f f f g g z z " ;  
              
             S y s t e m . o u t . p r i n t l n ( n o t T h e r e ( s t r ,   s t r 2 ) ) ;  
       }  
       p u b l i c   s t a t i c   i n t   n o t T h e r e ( S t r i n g   s ,   S t r i n g   s 2 )  
       {  
             i n t   c o u n t   =   0 ;  
             i n t   i   =   0 ;  
             f o r ( i   =   0 ;   i   <   s 2 . l e n g t h ( ) ;   i + + )  
             {  
                   S t r i n g   s 3   =   s . r e p l a c e ( s 2 . c h a r A t ( i )   +   " " ,   " " ) ;  
                   i n t   t e m p L e n g t h   =   s . l e n g t h ( )   -   s 3 . l e n g t h ( ) ;        
                   i f ( t e m p L e n g t h   ! =   0 )     / / s o m e t h i n g   w a s   r e m o v e d  
                         c o u n t + + ;  
             }  
             c o u n t   =   s 2 . l e n g t h ( )   -   c o u n t ;  
             r e t u r n ( c o u n t ) ;  
              
       }  
       / *  
       Y o u r   m e t h o d   i s   t o   r e t u r n   a n   i n t e g e r   r e p r e s e n t i n g   t h e   n u m b e r   o f   c h a r a c t e r s    
       i n   S t r i n g   s 2   t h a t   d o   n o t   a p p e a r   i n   S t r i n g   s .  
       * /  
 } 