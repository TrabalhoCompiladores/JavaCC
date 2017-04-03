/* Generated By:JavaCC: Do not edit this line. linguagemTokenManager.java */
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;

/** Token Manager. */
public class linguagemTokenManager implements linguagemConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
      debugStream.println("   No more string literal token matches are possible.");
   switch (pos)
   {
      case 0:
         if ((active0 & 0x7ff00000000L) != 0L)
         {
            jjmatchedKind = 9;
            return -1;
         }
         if ((active0 & 0x200000L) != 0L)
            return 4;
         return -1;
      case 1:
         if ((active0 & 0x7ff00000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 9;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 2:
         if ((active0 & 0x7fb00000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 9;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 3:
         if ((active0 & 0x7fb00000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 9;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 4:
         if ((active0 & 0x39a00000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 9;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 5:
         if ((active0 & 0x19a00000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 9;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 6:
         if ((active0 & 0x10200000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 9;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   debugStream.println("   No more string literal token matches are possible.");
   debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 13:
         jjmatchedKind = 4;
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 40:
         return jjStopAtPos(0, 27);
      case 41:
         return jjStopAtPos(0, 28);
      case 44:
         return jjStopAtPos(0, 31);
      case 59:
         return jjStopAtPos(0, 8);
      case 61:
         return jjStartNfaWithStates_0(0, 21, 4);
      case 95:
         return jjStopAtPos(0, 43);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x200000000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x50000000000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x20000000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x8100000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x5c00000000L);
      case 123:
         return jjStopAtPos(0, 29);
      case 125:
         return jjStopAtPos(0, 30);
      default :
      debugStream.println("   No string literal matches possible.");
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
      debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   debugStream.println("   Possible string literal matches : { "
 +
         jjKindsForBitVector(0, active0)  + " } ");
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
         debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
      return 1;
   }
   debugStream.println("Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x20L) != 0L)
            return jjStopAtPos(1, 5);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x4e100000000L);
      case 98:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000000L);
      case 101:
         if ((active0 & 0x400000000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x800000000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000000L);
      case 119:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000L);
      default :
      debugStream.println("   No string literal matches possible.");
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
      debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   debugStream.println("   Possible string literal matches : { "
 +
         jjKindsForBitVector(0, active0)  + " } ");
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
         debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
      return 2;
   }
   debugStream.println("Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000000L);
      case 100:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x45000000000L);
      case 113:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x12000000000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000000L);
      default :
      debugStream.println("   No string literal matches possible.");
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
      debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   debugStream.println("   Possible string literal matches : { "
 +
         jjKindsForBitVector(0, active0)  + " } ");
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
         debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
      return 3;
   }
   debugStream.println("Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
   switch(curChar)
   {
      case 97:
         if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(3, 32);
         break;
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000000L);
      case 110:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStopAtPos(3, 42);
         return jjMoveStringLiteralDfa4_0(active0, 0x800000000L);
      case 111:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(3, 37);
         break;
      case 114:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(3, 38);
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x11000000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000L);
      default :
      debugStream.println("   No string literal matches possible.");
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
      debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   debugStream.println("   Possible string literal matches : { "
 +
         jjKindsForBitVector(0, active0)  + " } ");
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
         debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
      return 4;
   }
   debugStream.println("Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x8a00000000L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000000L);
      case 114:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(4, 41);
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000000L);
      default :
      debugStream.println("   No string literal matches possible.");
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
      debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   debugStream.println("   Possible string literal matches : { "
 +
         jjKindsForBitVector(0, active0)  + " } ");
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
         debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
      return 5;
   }
   debugStream.println("Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000000000L);
      case 104:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(5, 36);
         break;
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x200000000L);
      case 111:
         if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(5, 35);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(5, 39);
         break;
      default :
      debugStream.println("   No string literal matches possible.");
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
      debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   debugStream.println("   Possible string literal matches : { "
 +
         jjKindsForBitVector(0, active0)  + " } ");
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
         debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
      return 6;
   }
   debugStream.println("Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
   switch(curChar)
   {
      case 114:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(6, 40);
         break;
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x200000000L);
      default :
      debugStream.println("   No string literal matches possible.");
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
      debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   debugStream.println("   Possible string literal matches : { "
 +
         jjKindsForBitVector(0, active0)  + " } ");
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
         debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
      return 7;
   }
   debugStream.println("Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
   switch(curChar)
   {
      case 111:
         if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(7, 33);
         break;
      default :
      debugStream.println("   No string literal matches possible.");
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   debugStream.println("   No more string literal token matches are possible.");
   debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   debugStream.println("Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 39;
   int i = 1;
   jjstateSet[0] = startState;
      debugStream.println("   Starting NFA to match one of : " + jjKindsForStateVector(curLexState, jjstateSet, 0, 1));
      debugStream.println("Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 10)
                        kind = 10;
                  }
                  else if ((0xac0000000000L & l) != 0L)
                  {
                     if (kind > 11)
                        kind = 11;
                  }
                  else if ((0x5000000000000000L & l) != 0L)
                  {
                     if (kind > 16)
                        kind = 16;
                  }
                  else if (curChar == 33)
                     jjCheckNAdd(4);
                  else if (curChar == 61)
                     jjCheckNAdd(4);
                  if (curChar == 47)
                     jjAddStates(0, 1);
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) != 0L && kind > 10)
                     kind = 10;
                  break;
               case 2:
                  if ((0xac0000000000L & l) != 0L && kind > 11)
                     kind = 11;
                  break;
               case 3:
                  if ((0x5000000000000000L & l) != 0L && kind > 16)
                     kind = 16;
                  break;
               case 4:
                  if (curChar == 61 && kind > 16)
                     kind = 16;
                  break;
               case 5:
                  if (curChar == 61)
                     jjCheckNAdd(4);
                  break;
               case 6:
                  if (curChar == 33)
                     jjCheckNAdd(4);
                  break;
               case 31:
                  if (curChar == 47)
                     jjAddStates(0, 1);
                  break;
               case 32:
                  if (curChar == 47)
                     jjCheckNAddTwoStates(33, 34);
                  break;
               case 33:
                  if ((0xfffffffffffffbffL & l) != 0L)
                     jjCheckNAddTwoStates(33, 34);
                  break;
               case 34:
                  if (curChar == 10)
                     kind = 6;
                  break;
               case 35:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(36, 38);
                  break;
               case 36:
                  if ((0xfffffffffffffbffL & l) != 0L)
                     jjCheckNAddTwoStates(36, 38);
                  break;
               case 37:
                  if (curChar == 47 && kind > 7)
                     kind = 7;
                  break;
               case 38:
                  if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 37;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 9)
                        kind = 9;
                  }
                  if (curChar == 118)
                     jjstateSet[jjnewStateCnt++] = 29;
                  else if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 25;
                  else if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 16;
                  else if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 7:
                  if (curChar == 111 && kind > 22)
                     kind = 22;
                  break;
               case 8:
                  if (curChar == 114)
                     jjCheckNAdd(7);
                  break;
               case 9:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 14:
                  if (curChar == 116)
                     jjCheckNAdd(7);
                  break;
               case 15:
                  if (curChar == 120)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 16:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 17:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if (curChar == 101 && kind > 22)
                     kind = 22;
                  break;
               case 19:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 20:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 21:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 22:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 23:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 24:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 25:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 26:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 27:
                  if (curChar == 105)
                     jjCheckNAdd(7);
                  break;
               case 28:
                  if (curChar == 122)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 29:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 30:
                  if (curChar == 118)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 33:
                  jjAddStates(2, 3);
                  break;
               case 36:
                  jjAddStates(4, 5);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 33:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(2, 3);
                  break;
               case 36:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(4, 5);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if (jjmatchedKind != 0 && jjmatchedKind != 0x7fffffff)
         debugStream.println("   Currently matched the first " + (jjmatchedPos + 1) + " characters as a " + tokenImage[jjmatchedKind] + " token.");
      if ((i = jjnewStateCnt) == (startsAt = 39 - (jjnewStateCnt = startsAt)))
         return curPos;
      debugStream.println("   Possible kinds of longer matches : " + jjKindsForStateVector(curLexState, jjstateSet, startsAt, i));
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
      debugStream.println("Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
   }
}
static final int[] jjnextStates = {
   32, 35, 33, 34, 36, 38, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, "\73", null, null, null, null, 
null, null, null, null, null, null, null, null, "\75", null, null, null, null, null, 
"\50", "\51", "\173", "\175", "\54", "\160\141\162\141", 
"\145\156\161\165\141\156\164\157", "\163\145", "\163\145\40\156\141\157", "\163\167\151\164\143\150", 
"\143\141\163\157", "\163\141\151\162", "\160\141\144\162\141\157", 
"\155\157\163\164\162\141\162", "\157\142\164\145\162", "\155\141\151\156", "\137", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xffff8610f01L, 
};
static final long[] jjtoSkip = {
   0xfeL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[39];
private final int[] jjstateSet = new int[78];
protected char curChar;
/** Constructor. */
public linguagemTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public linguagemTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 39; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      debugStream.println("Returning the <EOF> token.");
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100000600L & (1L << curChar)) != 0L)
   {
      debugStream.println("Skipping character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ")");
         curChar = input_stream.BeginToken();
   }
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
      debugStream.println("Current character : " + TokenMgrError.addEscapes(String.valueOf(curChar)) + " (" + (int)curChar + ") at line " + input_stream.getEndLine() + " column " + input_stream.getEndColumn());
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
      {
         debugStream.println("   Putting back " + (curPos - jjmatchedPos - 1) + " characters into the input stream.");
         input_stream.backup(curPos - jjmatchedPos - 1);
      }
    debugStream.println("****** FOUND A " + tokenImage[jjmatchedKind] + " MATCH (" + TokenMgrError.addEscapes(new String(input_stream.GetSuffix(jjmatchedPos + 1))) + ") ******\n");
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

protected static final int[][][] statesForState = {
 {
   { 0, 1, 2, 3, 5, 6, 13, 17, 26, 30, 31, },
   { 0, 1, 2, 3, 5, 6, 13, 17, 26, 30, 31, },
   { 0, 1, 2, 3, 5, 6, 13, 17, 26, 30, 31, },
   { 0, 1, 2, 3, 5, 6, 13, 17, 26, 30, 31, },
   { 4 },
   { 0, 1, 2, 3, 5, 6, 13, 17, 26, 30, 31, },
   { 0, 1, 2, 3, 5, 6, 13, 17, 26, 30, 31, },
   { 7 },
   { 8 },
   { 9 },
   { 10 },
   { 11 },
   { 12 },
   { 0, 1, 2, 3, 5, 6, 13, 17, 26, 30, 31, },
   { 14 },
   { 15 },
   { 16 },
   { 0, 1, 2, 3, 5, 6, 13, 17, 26, 30, 31, },
   { 18 },
   { 19 },
   { 20 },
   { 21 },
   { 22 },
   { 23 },
   { 24 },
   { 25 },
   { 0, 1, 2, 3, 5, 6, 13, 17, 26, 30, 31, },
   { 27 },
   { 28 },
   { 29 },
   { 0, 1, 2, 3, 5, 6, 13, 17, 26, 30, 31, },
   { 0, 1, 2, 3, 5, 6, 13, 17, 26, 30, 31, },
   { 32 },
   { 33 },
   { 34 },
   { 35 },
   { 36 },
   { 37 },
   { 38 },
 },

};
protected static final int[][] kindForState = {
{ 9, 10, 11, 16, 16, 16, 16, 22, 22, 22, 22, 22, 22, 22,
  22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22,
  22, 22, 6, 6, 6, 6, 7, 7, 7, 7}
};
   int kindCnt = 0;
  protected  final String jjKindsForBitVector(int i, long vec)
  {
    String retVal = "";
    if (i == 0)
       kindCnt = 0;
    for (int j = 0; j < 64; j++)
    {
       if ((vec & (1L << j)) != 0L)
       {
          if (kindCnt++ > 0)
             retVal += ", ";
          if (kindCnt % 5 == 0)
             retVal += "\n     ";
          retVal += tokenImage[i * 64 + j];
       }
    }
    return retVal;
  }

  protected  final String jjKindsForStateVector(int lexState, int[] vec, int start, int end)
  {
    boolean[] kindDone = new boolean[44];
    String retVal = "";
    int cnt = 0;
    for (int i = start; i < end; i++)
    {
     if (vec[i] == -1)
       continue;
     int[] stateSet = statesForState[curLexState][vec[i]];
     for (int j = 0; j < stateSet.length; j++)
     {
       int state = stateSet[j];
       if (!kindDone[kindForState[lexState][state]])
       {
          kindDone[kindForState[lexState][state]] = true;
          if (cnt++ > 0)
             retVal += ", ";
          if (cnt % 5 == 0)
             retVal += "\n     ";
          retVal += tokenImage[kindForState[lexState][state]];
       }
     }
    }
    if (cnt == 0)
       return "{  }";
    else
       return "{ " + retVal + " }";
  }

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}