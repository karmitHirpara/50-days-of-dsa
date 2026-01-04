/* ============================================================
LeetCode 3475: DNA Pattern Recognition

Biologists are studying basic patterns in DNA sequences.

Write a solution to identify sample_id records with the 
following patterns:
- sequences that start with ATG (start codon)
- sequences that end with TAA, TAG, or TGA (stop codons)
- sequences containing the motif ATAT
- sequences that have at least 3 consecutive G characters (GGG)

Return the result table ordered by sample_id in ascending order.
============================================================ */

select 
    sample_id,
    dna_sequence,
    species,
    dna_sequence regexp '^ATG' as has_start,
    dna_sequence regexp '(TAA|TAG|TGA)$' as has_stop,
    dna_sequence regexp 'ATAT' as has_atat,
    dna_sequence regexp 'GGG' as has_ggg
from 
    Samples
order by 
    sample_id asc;
