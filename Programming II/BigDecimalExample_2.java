i m p o r t   j a v a . m a t h . * ; 
 
 p u b l i c   c l a s s   B i g D e c i m a l E x a m p l e _ 2 
 { 
       p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g   [ ]   a r g s ) 
       { 
             / / e x a m p l e   :   r e c o m p u t e   o r i g i n a l   d o u b l e   e x a m p l e   u s i n g   B i g D e c i m a l 
             / / o r i g i n a l :   d o u b l e   n u m   =   0 . 0 2   +   0 . 1 4   +   0 . 3 ; 
             S y s t e m . o u t . p r i n t l n ( " \ n \ n E X A M P L E   1 :   p r e c i s i o n   c o n s i d e r a t i o n   u s i n g   B i g D e c i m a l   A d d i t i o n " ) ; 
             B i g D e c i m a l   b d N u m 1   =   n e w   B i g D e c i m a l ( " 0 . 0 2 " ) ;   / / c r e a t e   B i g D e c i m a l   o b j e c t s . N o t e :   n u m b e r s   s p e c i f i e d   a s   s t r i n g s 
             B i g D e c i m a l   b d N u m 2   =   n e w   B i g D e c i m a l ( " 0 . 1 4 " ) ; 
             B i g D e c i m a l   b d N u m 3   =   n e w   B i g D e c i m a l ( " 0 . 3 " ) ; 
             B i g D e c i m a l   b d S u m   =   n e w   B i g D e c i m a l ( " 0 . 0 " ) ; 
             
             / / u s e   t h e   a d d   m e t h o d   
             b d S u m   =   b d S u m . a d d ( b d N u m 1 ) . a d d ( b d N u m 2 ) . a d d ( b d N u m 3 ) ;     / / n u m 1   =   n u m 1   +   n u m 2   +   n u m 3 ; 
             
             / / d i s p l a y   t h e   o u t p u t 
             S y s t e m . o u t . p r i n t l n ( " \ n T h e   s u m   o f   a d d i n g   t h e   t h r e e   B i g D e c i m a l   v a l u e s   i s :   "   +   b d S u m ) ; 
             
             / / e x a m p l e   2 :   c o m p a r e   d o u b l e   r e s u l t   t o   B i g D e c i m a l   r e s u l t 
             d o u b l e   n u m   =   0 . 0 2   +   0 . 1 4   +   0 . 3 ; 
             S y s t e m . o u t . p r i n t l n ( " t h e   s u m   u s i n g   d o u b l e   n u m   =   "   +   n u m ) ;       / / p r i n t s   o u t   0 . 4 5 9 9 9 9 9 9 9 9 9 9 9 9 9 9 6 
             
             B i g D e c i m a l   b d A   =   n e w   B i g D e c i m a l ( " 0 . 0 2 " ) ; 
             B i g D e c i m a l   b d B   =   n e w   B i g D e c i m a l ( " 0 . 1 4 " ) ; 
             B i g D e c i m a l   b d C   =   n e w   B i g D e c i m a l ( " 0 . 3 " ) ; 
             b d S u m   =   n e w   B i g D e c i m a l ( " 0 . 0 " ) ; 
             b d S u m   =   b d S u m . a d d ( b d A ) . a d d ( b d B ) . a d d ( b d C ) ; 
             S y s t e m . o u t . p r i n t l n ( " b d S u m   =   "   +   b d S u m ) ; 
             S y s t e m . o u t . p r i n t l n ( " b d S u m . e q u a l ( n u m )   i s :   "   +   b d S u m . e q u a l s ( n u m ) ) ;   / / p r i n t s   o u t   0 . 4 6 
 
             
               
             
       } 
 } 
 / * P R O G R A M   O U T P U T 
 E X A M P L E   1 :   p r e c i s i o n   c o n s i d e r a t i o n   u s i n g   B i g D e c i m a l   A d d i t i o n 
 
 T h e   s u m   o f   a d d i n g   t h e   t h r e e   B i g D e c i m a l   v a l u e s   i s :   0 . 4 6 
 t h e   s u m   u s i n g   d o u b l e   n u m   =   0 . 4 5 9 9 9 9 9 9 9 9 9 9 9 9 9 9 6 
 b d S u m   =   0 . 4 6 
 b d S u m . e q u a l ( n u m )   i s :   f a l s e 
 * / 
 / / R e s o u r c e :   P r o g r a m m i n g   w i t h   J a v a   A   M u l t i m e d i a   A p p r o a c h ,   c h a p t e r   6 ,   p .   2 5 4 