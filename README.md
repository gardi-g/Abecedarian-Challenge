# Abecedarian-Challenge

What do the following words have in common?
 ```sh
a, ab, abs, ace, act, ad, adept, adopt, ads, aegis, ah, aim, aims,
air, airs, almost, alot, am, amp, amps, an, ant, any, art, as, be,
befit, begin, begins, below, belt, best, bet, bin, bins, biopsy,
bit, blow, bo, bow, box, boy, buy, by, cent, chip, chips, city, 
copy, cost, cow, cry, demo, deity, deny, dim, dims, dip, dips, 
dirt, dirty, do, dot, dry, empty, ex, film, films, fin, fins, 
first, fist, fit, fix, flow, flux, for, fort, forty, fox, ghost, 
glory, glow, gnu, go, got, guy, hi, him, hint, hip, hips, his, 
hit, hop, hops, host, hot, how, in, is, it, joy, knot, know, lost,
lot, low, most, my, no, nor, not, now, opt, or
```
# Question
They are called strictly ABeCeDarian, because the letters within each word are in strictly increasing alphabetical order. 
In this challenge we will be writing a program to generate all strictly abecedarian strings that can be made from an alphabet.

# Input Format
The input will consist of a single string made up of letters and numbers. The characters inside the string will appear in alphabetical order.

# Constraints
The string will be no longer than 20 characters long.

# Output Format
Output, in alphabetical order, all non-empty, strictly abecedarian strings that can be made from the given alphabet.

#Solution
The question was solved by using recursion. We are iterating k, which indicates the next character of the input string. We have a base case where whenever the string length is not 0, then we append to the stringbuffer that is being printed. In the loop, we are appending i which we set equal to the kth character and incrementing it with each recursive call. The longest length that the input string could be is itself (since there can't be any duplicates). So we decrement the length of the string and continue iterating to print all of the possible abecedarian strings.
