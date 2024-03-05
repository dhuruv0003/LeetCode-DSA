//948. Bag of Tokens
  // in this question our first step is to sort the array  and here we have two pointer low and high low will be pointed to the initial index and high will be pointing to 
//the last index
// because it will give convenience to us that if we have power grater than low then we can increase our score and reduce the power  as power -= tokens[low] and our
//low pointer will also shift

//but if our current score is greater than 1 and low!=high then we will decrease our score and power += tokens[high] and we will return score low !=high case is specifcally for
//[100,200] case as here we will power = 150; so first we can reduce power and score will be 1 and then low will point on 200 which is high so low==high loop will terminate and 
//score will be returned

class Solution
{
public
    int bagOfTokensScore(int[] tokens, int power)
    {
        Arrays.sort(tokens);
        int low = 0, high = tokens.length - 1;
        int score = 0;
        while (low <= high)
        {
            if (tokens[low] <= power)
            {
                power = power - tokens[low];
                score += 1;
                low++;
            }
            else if (score > 0 && low != high)
            {
                power = power + tokens[high];
                score = score - 1;
                high--;
            }
            else
            {
                return score;
            }
        }
        return score;
    }
}
