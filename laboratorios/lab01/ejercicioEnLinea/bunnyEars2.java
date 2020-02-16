public int bunnyEars2(int bunnies) {
  if(bunnies<1)return 0;
  else
  {
  if(bunnies%2==0)
  return 3+bunnyEars2(bunnies-1);
  else return 2+bunnyEars2(bunnies-1);
  }
}

