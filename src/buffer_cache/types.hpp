#ifndef __BUFFER_CACHE_TYPES_HPP__
#define __BUFFER_CACHE_TYPES_HPP__

#include "utils2.hpp"

typedef uint64_t block_id_t;
#define NULL_BLOCK_ID (block_id_t(-1))


typedef uint32_t block_magic_comparison_t;

struct block_magic_t {
    char bytes[sizeof(block_magic_comparison_t)];
};

template <class block_value_t>
bool check_magic(block_magic_t magic) {
    union {
        block_magic_t x;
        block_magic_comparison_t n;
    } u, v;

    u.x = magic;
    v.x = block_value_t::expected_magic;
    
    return u.n == v.n;
}

#endif /* __BUFFER_CACHE_TYPES_HPP__ */
